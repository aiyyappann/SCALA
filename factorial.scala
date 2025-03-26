object factorial
{
    def main(args:Array[String]) =
    {
        println(factorial(5));
    }
def factorial(x:BigInt):BigInt=if(x==0)1 else x * factorial(x-1)

}