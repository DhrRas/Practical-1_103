class Car(var carobjn:Int, var type:String, var model:String, var originalprice:Long,var currentprice: Long ,var owner: String, var milesdrive: Long){
    init{
        println("Creating car calss bject car$carobjn in next line")
        println("Object of class is created and Init is called.")
    }
    fun getcarprice():Long{
        return originalprice

    }
    fun getcarinformtion():Array<String>{
        var a1 = arrayOf<String>(type,model,owner)
        return a1
    }
    fun getoriginalprice():Long{
        return originalprice
    }
    fun getcurrentprice():Long{
        return currentprice
    }
    fun displaycarinfo(){
        println("-----------")
        var a = getcarinformtion()
        println("Car ifnormation:${a[0]},${a[1]}")
        println("Car owner: ${a[2]}")
        println("Miles Drive: $milesdrive")
        println("Original Car Price : $originalprice")
        println("Current Car Price: $currentprice")
        println("------------")
    }
}
fun main() {
    var no: Int= 0;
    no = no + 1
    var obj1 = Car(no,"BMW","2018",10000000,98950,"Dhruv",103)
    obj1.displaycarinfo()
    no = no + 1
    var obj2 = Car(no,"Mercedes-Benz","2019",4000000,350000,"Smit",20)
    obj2.displaycarinfo()
    println("*********** ArrayList of Car **************")
    no = no + 1
    var obj3 = Car(no,"Toyota","2017",1080000,1079000,"Shobhit", 100)
    no = no + 1
    var obj4 = Car(no, "TATA","2023",3500000,4998000,"Shikhar",200)
    var person = arrayOf<Car>(obj3,obj4)
    for(i in person) {
        i.displaycarinfo()
    }
    }

