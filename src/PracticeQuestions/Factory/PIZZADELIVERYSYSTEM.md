classDiagram
direction BT
class MargheritaFactory
class MargheritaPizza
class PepperoniFactory
class PepperoniPizza
class Pizza
class PizzaDeliverySystem
class PizzaFactory {
<<Interface>>

}
class VeggieFactory
class VeggiePizza

MargheritaFactory  ..>  MargheritaPizza : «create»
MargheritaFactory  ..>  PizzaFactory 
MargheritaPizza  -->  Pizza 
PepperoniFactory  ..>  PepperoniPizza : «create»
PepperoniFactory  ..>  PizzaFactory 
PepperoniPizza  -->  Pizza 
PizzaDeliverySystem  ..>  MargheritaFactory : «create»
PizzaDeliverySystem  ..>  PepperoniFactory : «create»
PizzaDeliverySystem  ..>  VeggieFactory : «create»
VeggieFactory  ..>  PizzaFactory 
VeggieFactory  ..>  VeggiePizza : «create»
VeggiePizza  -->  Pizza 
