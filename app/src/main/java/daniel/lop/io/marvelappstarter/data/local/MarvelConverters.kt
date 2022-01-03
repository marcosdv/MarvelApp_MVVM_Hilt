package daniel.lop.io.marvelappstarter.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import daniel.lop.io.marvelappstarter.data.model.ThumbnailModel

class MarvelConverters {
    @TypeConverter
    fun fromThumbnail(thumbnail: ThumbnailModel): String = Gson().toJson(thumbnail)

    @TypeConverter
    fun toThumbnail(thumbnail: String): ThumbnailModel = Gson().fromJson(thumbnail, ThumbnailModel::class.java)
}