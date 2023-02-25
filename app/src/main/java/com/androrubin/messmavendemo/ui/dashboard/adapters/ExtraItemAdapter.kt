package com.androrubin.messmavendemo.ui.dashboard.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androrubin.messmavendemo.R
import com.androrubin.messmavendemo.ui.dashboard.ExtraData

class ExtraItemAdapter (private val itemList : ArrayList<ExtraData>): RecyclerView.Adapter<ExtraItemAdapter.Myviewholder> (){


//    private lateinit var mListener: onItemClickListener
//
//
//    interface onItemClickListener{
//
//        fun onItemClick(position: Int)
//    }


//    fun setOnItemClickListener(listener: onItemClickListener){
//
//        mListener = listener
//    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.extra_item,parent,false)

        return Myviewholder(itemView) //,mListener
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {


        val currentItem =itemList[position]
        holder.itemImage.setImageResource(currentItem.e_Image)
        holder.itemName.text =currentItem.e_Name
        holder.itemPrice.text =currentItem.e_Price

    }

    override fun getItemCount(): Int {
        return  itemList.size
    }

    class Myviewholder(itemView : View) : RecyclerView.ViewHolder(itemView){//, listener:onItemClickListener


        val itemImage: ImageView = itemView.findViewById(R.id.item_image)
        val itemName: TextView = itemView.findViewById(R.id.item_name)
        val itemPrice: TextView = itemView.findViewById(R.id.item_price)

//        init {
//            itemView.setOnClickListener{
//
//                listener.onItemClick(adapterPosition)
//            }
//        }

    }
}