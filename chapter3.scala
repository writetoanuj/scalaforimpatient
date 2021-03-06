// Q1
import util.Random

val a = new Array[Int](10)
val r = new Random
for (i <- 0 until 10) {
    a(i)=r.nextInt(10)
}

for (i <- 0 until 10) {
    println(a(i))
}


// Q2
val a = Array(1,2,3,4,5)

for (i <- 0 until a.size) {
    if ( i % 2 == 0 && i < a.size-1) {
        val temp = a(i)
        a(i)=a(i+1)
        a(i+1)=temp
    }
}

for (i<-0 until a.size) {
    println(a(i))
}

//Q3
val a = Array(1,2,3,4,5)

val b = for (i <- 0 until a.size)  yield {
    if ( i % 2 == 0 && i < a.size-2) {
        a(i+1)
    }
    else if ( i%2 != 0 && i>0) { a(i-1)}
    else a(i)
}

for (i<-0 until b.size) {
    println(b(i))
}

//Q4 
val test = Array(10, 7, -5, 11, -44, 0, 22, -22, -100, 77, -5);
test.filter(_>0) ++ test.filter(_<=0)

//Q6
test.sortWith(_>_)

// Q7
test.distinct

//Q8
var tz = java.util.TimeZone.getAvailableIDs
for (i<- 0 until tz.size) {
    tz(i) = tz(i).replace("Africa/","")
}

//Q9
import java.awt.datatransfer._



