package it.example.jacksonAnnotationBugLib

sealed trait Animal

object Animal {
  final case class Skunk(name: String) extends Animal
}