object PolygonUtils{
  def inside(point: Array[Double], polygon: Array[Array[Double]]): Boolean = {
    // ray-casting algorithm based on
    // http://www.ecse.rpi.edu/Homepages/wrf/Research/Short_Notes/pnpoly.html
    
    val x = point(0)
    val y = point(1)

    var inside=false

    var i = 0
    var j = polygon.length - 1
    while ( {
      i < polygon.length
    }) {
      val xi = polygon(i)(0)
      val yi = polygon(i)(1)
      val xj = polygon(j)(0)
      val yj = polygon(j)(1)
      val intersect = ((yi > y) != (yj > y)) && (x < (xj - xi) * (y - yi) / (yj - yi) + xi)
      if (intersect) inside = !inside

      j = {
        i += 1; i - 1
      }
    }

    inside
  }

}



object Program{
  
  def main(args:Array[String]) : Unit = {
    var polygon = Array(Array( 1.0, 1.0 ), Array( 1.0, 2.0 ), Array( 2.0, 2.0 ), Array( 2.0, 1.0 ) )

    println(PolygonUtils.inside(Array( 1.5, 1.5 ), polygon))
    println(PolygonUtils.inside(Array(4.9, 1.2), polygon))
    println(PolygonUtils.inside(Array(1.8, 1.1), polygon))
  }
}
