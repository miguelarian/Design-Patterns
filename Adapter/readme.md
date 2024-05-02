# Adapter pattern

*"Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate."* - [source](https://refactoring.guru/design-patterns/adapter)

## Class diagram

<div hidden>
```
@startuml adapter
interface Shape {
    + getArea(): double
    + getPerimeter(): double
}
class Triangle implements Shape {
    - base: double
    - height: double
    + Triangle(base: double, height: double)
    + getArea(): double
    + getPerimeter(): double
}
class Rectangle {
    - width: double
    - height: double
    + Rectangle(width: double, height: double)
    + getWidth(): double
    + getHeight(): double
    + getArea(): double
    + getPerimeter(): double
}
class RectangleAdapter implements Shape {
    - rectangle: Rectangle
    + RectangleAdapter(rectangle: Rectangle)
    + getArea(): double
    + getPerimeter(): double
}
note top of RectangleAdapter : Adapter
note right of RectangleAdapter::rectangle
  Adaptee
end note
class Main {
    - shapes: List<Shape>
}
RectangleAdapter --> Rectangle : "has-a rectangle adaptee"
Main --> Shape : uses
@enduml
```
</div>

![test](adapter.svg)

Some more markdown.