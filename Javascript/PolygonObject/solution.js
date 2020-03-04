/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */
class Polygon {
    constructor(costats) {
        this.localCostat = costats;
    }
    perimeter(){
        let perimetre = 0;
        let i = 0;
        for(i=0;i<this.localCostat.length;i++){
            perimetre+=this.localCostat[i];
        }
        return perimetre;
    }
}

const rectangle = new Polygon([10, 20, 10, 20]);
const square = new Polygon([10, 10, 10, 10]);
const pentagon = new Polygon([10, 20, 30, 40, 43]);

console.log(rectangle.perimeter());
console.log(square.perimeter());
console.log(pentagon.perimeter());
