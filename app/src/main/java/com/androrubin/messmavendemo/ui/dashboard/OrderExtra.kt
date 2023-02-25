package com.androrubin.messmavendemo.ui.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androrubin.messmavendemo.R
import com.androrubin.messmavendemo.ui.dashboard.adapters.ExtraItemAdapter



class OrderExtra : Fragment() {



//    private lateinit var itemRecyclerView: RecyclerView
//    private lateinit var extraList: ArrayList<ExtraData>
//    private  lateinit var myAdapter:ExtraItemAdapter
//
//    lateinit var imageId: Array<Int>
//    lateinit var itemName: Array<String>
//    lateinit var itemPrice: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        imageId = arrayOf(
//            R.drawable.image_omelette,
//            R.drawable.image_omelette,
//            R.drawable.image_omelette,
//                    R.drawable.image_omelette,
//                    R.drawable.image_omelette,
//                    R.drawable.image_omelette
//
//
//
//
//        )
//
//        itemName = arrayOf(
//           "omelette",
//            "omelette",
//            "omelette",
//            "omelette",
//            "omelette",
//            "omelette"
//        )
//
//        itemPrice= arrayOf(
//            "₹ 40",
//            "₹ 40",
//            "₹ 40",
//            "₹ 40",
//            "₹ 40",
//            "₹ 40"
//        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =     inflater.inflate(R.layout.fragment_order_extra, container, false)
//
//        itemRecyclerView = view.findViewById(R.id.extra_itemRecyclerview)
//        itemRecyclerView.layoutManager = GridLayoutManager(context,2)
//        itemRecyclerView.setHasFixedSize(true)
//        Toast.makeText(requireContext(),"recyclerview",Toast.LENGTH_SHORT).show()
//
//        extraList = arrayListOf<ExtraData>()
//        Toast.makeText(requireContext(),"recyclerview${extraList.size}",Toast.LENGTH_SHORT).show()
//
//        getExtradata()

//        Toast.makeText(context,"recyclerview${extraList.size}",Toast.LENGTH_SHORT).show()
//        myAdapter = ExtraItemAdapter(extraList)
//        itemRecyclerView.adapter = myAdapter

         val item1=view.findViewById<CardView>(R.id.card1)
        val name1=view.findViewById<TextView>(R.id.item_name1)
        val price1=view.findViewById<TextView>(R.id.item_price1)

          item1.setOnClickListener {
              val intent= Intent(activity,  ItemPurchaseActivity::class.java)
              intent.putExtra("Name1",name1.toString())
              intent.putExtra("Price1",price1.toString())
              startActivity(intent)
          }


        val item2=view.findViewById<CardView>(R.id.card2)
        val name2=view.findViewById<TextView>(R.id.item_name)
        val price2=view.findViewById<TextView>(R.id.item_price)
        item2.setOnClickListener {
            val intent= Intent(activity,  ItemPurchaseActivity::class.java)
            intent.putExtra("Name2",name2.toString())
            intent.putExtra("Price2",price2.toString())
            startActivity(intent)
        }


        val item3=view.findViewById<CardView>(R.id.card4)
        val name3=view.findViewById<TextView>(R.id.item_name4)
        val price3=view.findViewById<TextView>(R.id.item_price4)
        item3.setOnClickListener {
            val intent= Intent(activity,  ItemPurchaseActivity::class.java)
            intent.putExtra("Name3",name3.toString())
            intent.putExtra("Price3",price3.toString())
            startActivity(intent)
        }


        val item4=view.findViewById<CardView>(R.id.card5)
        val name4=view.findViewById<TextView>(R.id.item_name5)
        val price4=view.findViewById<TextView>(R.id.item_price5)
        item4.setOnClickListener {
            val intent= Intent(activity,  ItemPurchaseActivity::class.java)
            intent.putExtra("Name4",name4.toString())
            intent.putExtra("Price4",price4.toString())
            startActivity(intent)
        }


        val item5=view.findViewById<CardView>(R.id.card6)
        val name5=view.findViewById<TextView>(R.id.item_name6)
        val price5=view.findViewById<TextView>(R.id.item_price6)
        item5.setOnClickListener {
            val intent= Intent(activity,  ItemPurchaseActivity::class.java)
            intent.putExtra("Name5",name5.toString())
            intent.putExtra("Price5",price5.toString())
            startActivity(intent)
        }


        val item6=view.findViewById<CardView>(R.id.card7)
        val name6=view.findViewById<TextView>(R.id.item_name7)
        val price6=view.findViewById<TextView>(R.id.item_price7)
        item6.setOnClickListener {
            val intent= Intent(activity,  ItemPurchaseActivity::class.java)
            intent.putExtra("Name6",name6.toString())
            intent.putExtra("Price6",price6.toString())
            startActivity(intent)
        }

        return view
    }


    companion object {

    }
}


