package com.epam.engx.m1.l3.task4;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ApplicationInfoTest {
  ApplicationInfoRepository repository = mock(ApplicationInfoRepository.class);
  ApplicationInfo applicationInfo = new ApplicationInfo(repository);


  @Test
  public void When_TheInformationIsStore_Expect_ToSeeOperationSystem_Java_Working_directory() {
    applicationInfo.store();
    verify(repository).save(contains("\n* Operating system:"));
    verify(repository).save(contains("\n* Java version:"));
    verify(repository).save(contains("\n* Working directory:"));
  }
}
