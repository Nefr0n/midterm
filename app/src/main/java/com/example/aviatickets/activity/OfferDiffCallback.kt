package com.example.aviatickets.activity


import androidx.recyclerview.widget.DiffUtil
import com.example.aviatickets.model.entity.Offer
class OfferDiffCallback(
    private val oldItems: List<Offer>,
    private val newItems: List<Offer>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        // Implement logic to compare Offer objects for identity (e.g., Offer ID)
        return oldItems[oldItemPosition].id == newItems[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldOffer = oldItems[oldItemPosition]
        val newOffer = newItems[newItemPosition]

        return oldOffer.price == newOffer.price &&
                oldOffer.flight.departureLocation == newOffer.flight.departureLocation && oldOffer.flight.departureTimeInfo == newOffer.flight.departureTimeInfo &&
                oldOffer.flight.arrivalLocation == newOffer.flight.arrivalLocation &&
                oldOffer.flight.arrivalTimeInfo == newOffer.flight.arrivalTimeInfo &&
                oldOffer.flight.flightNumber == newOffer.flight.flightNumber &&
                oldOffer.flight.airline == newOffer.flight.airline &&
                oldOffer.flight.duration == newOffer.flight.duration

    }
}
