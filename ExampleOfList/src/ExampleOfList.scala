object ExampleOfList 
{
    def main(args: Array[String])
  {
  
     var fruit=List("apple","banana","pineapple","pear","orange");
     
     var x=fruit.slice(3,5)
     fruit.tail
     var(l,r)=fruit.splitAt(3)
     println(x)
     println(l)
     println(r)
     println(fruit.reverse)
     
  }
 
}