interface LivingThing{
    fun speaking(): Unit
    fun eating(): Unit 
    fun going(): Unit
    fun sleeping(): Unit
}
interface Intimacy{
    fun kissing(): Unit
    fun loving(): Unit
    fun cuddling(): Unit
    
}

class Human(name: String = "") : LivingThing, Intimacy{
    private var name: String = ""
    init{
        this.name = name
    }
    
    fun setName(name: String): Unit{
        this.name = name
    }
    fun getName(): String{
        return this.name
    }
    override fun speaking(): Unit{
        println("$name is speaking...")
    }
    override fun eating(): Unit{
        println("$name is eating...")
    }
    override fun going(): Unit{
        println("$name is going...")
    }
    override fun sleeping(): Unit{
        println("$name is sleeping...")
    }
    override fun kissing(): Unit{
        println("$name is kissing...")
    }
    override fun loving(): Unit{
        println("$name is loving...")
    }
    override fun cuddling(): Unit{
        println("$name is cuddling...")
    }
}

fun main(){
    val human: Human;
    human = Human()
    human.setName("Galeez")
    human.speaking()
    human.eating()
    human.going()
    human.sleeping()
    human.kissing()
   
    
}
