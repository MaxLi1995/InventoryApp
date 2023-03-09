package com.maxli.inventoryapp

import android.app.Application
import com.maxli.inventoryapp.data.ItemRoomDatabase


class InventoryApplication : Application(){
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}