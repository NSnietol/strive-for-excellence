package com.epam.engx.notificator;

import com.epam.engx.notificator.dto.Person;
import com.epam.engx.notificator.dto.UserAction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


class NotificationServiceTest {


    private INotificator mockNotificator1;
    private INotificator mockNotificator2;

    private NotificationService objectUnderTest;
    private final Person person = new Person(123, "Nilson");
    private final UserAction userAction = UserAction.DEPLOY;


    @BeforeEach
    void setUp() {
        mockNotificator1 = mock(INotificator.class);
        mockNotificator2 = mock(INotificator.class);

        List<INotificator> notificators = Arrays.asList(mockNotificator1, mockNotificator2);
        objectUnderTest = new NotificationService(notificators);
    }

    @Test
    public void when_OnlyOneUserActionIsEligibleForNotification_ShouldSentNotificationOnce() {
        when(mockNotificator1.isApplicable(userAction)).thenReturn(true);
        when(mockNotificator2.isApplicable(userAction)).thenReturn(false);

        objectUnderTest.sendNotifications(person, userAction);

        verify(mockNotificator1).notify(person, userAction);
        verify(mockNotificator2, never()).notify(person, userAction);
    }

    @Test
    public void when_ManyUserActionsAreEligibleForNotification_ShouldSentNotificationOnce() {
        when(mockNotificator1.isApplicable(userAction)).thenReturn(true);
        when(mockNotificator2.isApplicable(userAction)).thenReturn(true);



        objectUnderTest.sendNotifications(person, userAction);

        verify(mockNotificator1, times(1)).notify(person, userAction);
        verify(mockNotificator2, times(1)).notify(person, userAction);
    }

    @Test
    public void when_TheUserActionAreNotEligibleForNotification_ShouldNotSentNotifications() {

        when(mockNotificator1.isApplicable(userAction)).thenReturn(false);
        when(mockNotificator2.isApplicable(userAction)).thenReturn(false);

        objectUnderTest.sendNotifications(person, userAction);

        verify(mockNotificator1, never()).notify(person, userAction);
        verify(mockNotificator2, never()).notify(person, userAction);
    }

    @Test
    public void when_ThereAreNotNotificators_ShouldNotSentNotification() {
        List<INotificator> emptyList = Collections.emptyList();
        objectUnderTest = new NotificationService(emptyList);

        objectUnderTest.sendNotifications(person, userAction);

        verify(mockNotificator1, never()).isApplicable(userAction);
        verify(mockNotificator2, never()).isApplicable(userAction);
        verify(mockNotificator1, never()).notify(person, userAction);
        verify(mockNotificator2, never()).notify(person, userAction);
    }


    @Test
    public void when_TheNotificationIsNull_ThrowsNullPointer() {

        objectUnderTest = new NotificationService(null);
        assertThrows(NullPointerException.class,
                ()->  objectUnderTest.sendNotifications(person, userAction));
    }


}