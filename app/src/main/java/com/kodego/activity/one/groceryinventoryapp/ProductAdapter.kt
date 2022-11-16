package com.kodego.activity.one.groceryinventoryapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kodego.activity.one.groceryinventoryapp.databinding.RowItemBinding

class ProductAdapter(val products:List<Products>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(val binding:RowItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
      val layoutInflater = LayoutInflater.from(parent.context)
      val binding  = RowItemBinding.inflate(layoutInflater, parent, false)
      return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.binding.apply {
            imgProduct.setImageResource(products[position].imageName)
            tvItemName.text = products[position].itemName
            tvDescription.text = products[position].itemDescription

        }
    }

    override fun getItemCount(): Int {
        return products.size
    }
}