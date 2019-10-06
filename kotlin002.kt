class View{
    
    interface OnItemClickListener{
        
        fun onItemClick(position: Int): Unit
        
    }
    interface OnClickListener{
        fun onClick() : Unit
    }
    interface onTouchListener{
        
        fun onTouch(from:Pair<Int, Int>, to:Pair<Int, Int>): Unit
    }
     class Editor{
         
         public fun write(string: String): Unit
         {
             println("$string has been written.");
         }
         
     }
    
    
}

class Button{
    lateinit private var clickable : View.OnClickListener 
    fun setOnClickListener(clickable: View.OnClickListener){
         this.clickable = clickable
        this.clickable.onClick()
    }
}
fun main(){
    val aButton = Button()
    aButton.setOnClickListener(object: View.OnClickListener{
        override fun onClick(){
            println("I am being clicked.");
        }
    })
    
    val anEditor = View.Editor()
    anEditor.write("Galeez Insaan")
}
