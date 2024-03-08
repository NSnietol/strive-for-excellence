# Managing technical debt : Payoff practices


To repay technical debt, various practices can be used, all of which involve answering **three general questions**: when to repay it, what changes must be made, and who exactly repays it.


## When ? 

- Never : Code is rarely or never read or changed, the system has reached its end of life. The project is experimental or a prototype.
- From time to time : if you use an Agile approach such as scrum or Kaban, you can capture it into technical tasks.
- Regularly : This is the most robust option. It works well with regular development cycles. It is also the most natural for teams that use the Kanban-like.
- On-demand : Sometimes, the severity of technical debt becomes so high that further work is impossible without exponential growth of interest. Ensure you have a list of the required refactors.

## What?

- Reactive prioritization : As with any financial debt, technical debt constantly drains team resources. Quantifying the actual cost of maintaining technical debt can be challenging due to its multifaceted nature.
- Proactive prioritization : Proactive management of technical debt requires looking for possible sources of future issues. For example, if a significant feature is planned for development in the next few months.

## Who?

- Entire team ( via dedicated sprint): It can regular or on demand, the advantage focusing only on paying down technical debts boosts developer morale, and the downside is the without resources available would be hard to support escalations.
- Dedicated capacity : In this model, the Agile team reserves a fixed point count or percentage of overall capacity for the sprint to pay down debt on an ongoing basis
- Dedicated resources: This is a combination of the previous two approaches. In each sprint, a small part of the team (probably just one developer) is assigned to work on reducing technical debt while the rest of the team focuses solely on traditional tasks.