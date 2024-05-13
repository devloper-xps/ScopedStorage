/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.socpedstoragedemo.imagedemo

import android.net.Uri
import androidx.recyclerview.widget.DiffUtil
import java.util.*

data class MediaStoreModel(
    val id: Long,
    val displayName: String,
    val dateTaken: Date,
    val contentUri: Uri
){
    companion object {
        val DiffCallback = object : DiffUtil.ItemCallback<MediaStoreModel>() {
            override fun areItemsTheSame(oldItem: MediaStoreModel, newItem: MediaStoreModel) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: MediaStoreModel, newItem: MediaStoreModel) =
                oldItem == newItem
        }
    }
}