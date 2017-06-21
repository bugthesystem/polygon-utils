# polygon-utils
Ray-casting algorithm to determine if point is inside a polygon

## Sample Code

```scala
var polygon = Array(Array( 1.0, 1.0 ), Array( 1.0, 2.0 ), Array( 2.0, 2.0 ), Array( 2.0, 1.0 ) )

println(PolygonUtils.inside(Array( 1.5, 1.5 ), polygon))
println(PolygonUtils.inside(Array(4.9, 1.2), polygon))
println(PolygonUtils.inside(Array(1.8, 1.1), polygon))

// True, False, True
```
