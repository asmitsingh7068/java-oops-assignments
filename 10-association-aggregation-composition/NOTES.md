# Association / Aggregation / Composition

## Association
A general relationship between two classes where they are connected.

## Aggregation
A "has-a" relationship where one object can exist independently of the other.

## Composition
A strong "has-a" relationship where one object is fully owned by another and usually cannot exist independently in the same design context.

### Example in this folder
`Car` has an `Engine`, and the `Engine` object is created inside `Car`, which demonstrates a composition-style relationship.