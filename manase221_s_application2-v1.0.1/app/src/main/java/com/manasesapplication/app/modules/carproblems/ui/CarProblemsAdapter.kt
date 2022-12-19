package com.manasesapplication.app.modules.carproblems.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.manasesapplication.app.R
import com.manasesapplication.app.databinding.RowCarProblemsBinding
import com.manasesapplication.app.modules.carproblems.`data`.model.CarProblemsRowModel
import kotlin.Int
import kotlin.collections.List

class CarProblemsAdapter(
  var list: List<CarProblemsRowModel>
) : RecyclerView.Adapter<CarProblemsAdapter.RowCarProblemsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCarProblemsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_car_problems,parent,false)
    return RowCarProblemsVH(view)
  }

  override fun onBindViewHolder(holder: RowCarProblemsVH, position: Int) {
    val carProblemsRowModel = CarProblemsRowModel()
    // TODO uncomment following line after integration with data source
    // val carProblemsRowModel = list[position]
    holder.binding.carProblemsRowModel = carProblemsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CarProblemsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: CarProblemsRowModel
    ) {
    }
  }

  inner class RowCarProblemsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCarProblemsBinding = RowCarProblemsBinding.bind(itemView)
  }
}
