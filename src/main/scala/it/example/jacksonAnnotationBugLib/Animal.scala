package it.example.jacksonAnnotationBugLib

import com.fasterxml.jackson.annotation.{JsonSubTypes, JsonTypeInfo}
import it.example.jacksonAnnotationBugLib.Animal.Skunk

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes(
  Array(new JsonSubTypes.Type(value = classOf[Skunk], name = "skunk"))
)
sealed trait Animal

object Animal {
  final case class Skunk(name: String) extends Animal
}