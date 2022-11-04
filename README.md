# Evolutionary Design - Training

As you may know, writing code consists mostly of two activities which are:

- an implementing activity, or adding **behavior** and;
- an refactoring activity, or refining the **design**.

Most of the time, we are writing code doing both of these activities at the same time. Differentiating them, only up to a certain point but never completly.

The underlying reasoning on whose these activities are based are called **deductive** and **inductive** approaches.

Mixing those two have certain advantage, like going faster, but also have some costs.

Not only the written design is bound to previous mental models that we have met on previous codebases, i.e. our own experience, instead of being purely organic (i.e. related only to the domain and implemented behavior), but more importantly, this leads to design to be made more with opinion based decisions than with facts (thus observable elements) and proofs.

In other word, this methodoloy helps writing source code relying most exclusively on the **inductive approach**.

Surely, this is nothing new for someone with a TDD background, but! This method goes way further and maybe (surely) it not (yet) stamped "production ready", it does worth being discovered and played with, if only to better undersand our evolved apes decision making processes and better apprehend the great complexity of it; as well as going slowly and learn ways and techniques to better evolve the design of our code bases.


Hopefully, this introduction will make you want to know more. If so, look just below, it's a collection of resources gathered during my exploration.

## More on this repository
This repository is my exploration on this methodology.

It contains tries, failures, errors and notes. Steps taken are not made to be easily readable or accessible. It's more a draft and a proof a work that the methodology works and can be used. Though, it definitely should be made some day...

This example uses a kind of a bingo game. [Advent of Code's day 4: Giant Squid](https://adventofcode.com/2021/day/4) is the full problem description.

# Resources
[What is Evolutionary Design?](https://blog.adrianbolboaca.ro/2017/05/what-is-evolutionary-design/) introduces the reader to this concept. Site is currently down, but a [snapshot](https://web.archive.org/web/20210624124613/https://blog.adrianbolboaca.ro/2018/05/what-is-evolutionary-design/) has been made in 2021.

The concept is presented [here](https://web.archive.org/web/20210624121834/https://blog.adrianbolboaca.ro/2017/06/evolutionary-design-normalize-growth/) with a gardening analogy. Site is currently down, head over the [snapshot](https://web.archive.org/web/20210624121834/https://blog.adrianbolboaca.ro/2017/06/evolutionary-design-normalize-growth/) instead.

The above mentioned article plus links to other resources are compiled [here](https://blog.adrianbolboaca.ro/evolutionary-design/). Once again, tthe target resource is down, so what about visiting this [snapshot](https://web.archive.org/web/20201128070715/https://blog.adrianbolboaca.ro/evolutionary-design/) instead?

Because theory is nothing without practice, this collection of [live coding](https://www.youtube.com/playlist?list=PLlOmk325wSKLjw_RGzpBV8MIfi4zSlbwM), by Adrian Bolboaca, is a great way to learn about the processes and see the actual growth happening.

Adrian Bolboaca's slides [Evolutionary Design - Refactoring Heuristics](https://www.slideshare.net/adibolb/evolutionary-design-refactoring-heuristics) exposes its reflexion on code evolution and showcases some refactoring pattern.

In it's [TDD as If You Meant It](https://cumulative-hypotheses.org/2011/08/30/tdd-as-if-you-meant-it/) article, Keith Braithwaite explains how TDD is often misused and provides a way of doing using other steps that do not lead to the same mistakes. It's like a first step towards evolutionary design as a discipline.

Cyrille Martaire's blog article [Adrian Bolboaca on Evolutionary Design](https://medium.com/@cyrillemartraire/adrian-bolboaca-on-evolutionary-design-inductive-vs-deductive-approaches-a7cead4bdd20) summarizes Adrian Bolboaca meetup on Evolutionary Design. It's a great resource to better understand inductive and deductive approaches as well as having a glimpse of the methodology processes themselves.

 Bob Martin's blog article [Transformation Priority Premise](https://blog.cleancoder.com/uncle-bob/2013/05/27/TheTransformationPriorityPremise.html) introduces transformations (changes in code that occur outside of the refactoring part) and show how it can help better conduct changes.

The wikipedia entry for [Transformation Priority Premise](https://en.wikipedia.org/wiki/Transformation_Priority_Premise) is a good spot to go too.
