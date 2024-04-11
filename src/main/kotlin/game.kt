package org.example

import com.google.gson.annotations.SerializedName

class game(val title:String ) {

    override fun toString(): String {
        return "game(title='$title')"
    }
}