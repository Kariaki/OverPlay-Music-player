package com.overplay.overplay.Adapter.ViewHolders.Plugs

import android.view.LayoutInflater
import android.view.ViewGroup
import com.overplay.overplay.Adapter.ViewHolders.FolderViewHolder
import com.overplay.overplay.Adapter.ViewHolders.MainViewHolder
import com.overplay.overplay.Adapter.ViewHolders.MusicViewHolder
import com.overplay.overplay.R
import com.votenoid.votenoid.Adapter.GeneralAdapter

object SongsPlug {

    val plug = object : GeneralAdapter.ViewHolderPlug {
        override fun setPlug(group: ViewGroup, viewType: Int): MainViewHolder {
           val contentView=LayoutInflater.from(group.context).inflate(R.layout.music_item,group,false)
            return MusicViewHolder(contentView)
        }
    }
    val folderPlug = object : GeneralAdapter.ViewHolderPlug {
        override fun setPlug(group: ViewGroup, viewType: Int): MainViewHolder {
            val contentView=LayoutInflater.from(group.context).inflate(R.layout.folder_design,group,false)
            return FolderViewHolder(contentView)
        }
    }
}