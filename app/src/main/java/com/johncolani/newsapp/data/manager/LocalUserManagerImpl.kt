package com.johncolani.newsapp.data.manager

import android.content.Context
import android.preference.PreferenceDataStore
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.johncolani.newsapp.domain.manager.LocalUserManager
import com.johncolani.newsapp.util.Constants
import com.johncolani.newsapp.util.Constants.USER_SETTINGS
import dagger.hilt.android.internal.Contexts
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl (
    private val context: Context
): LocalUserManager{
    override suspend fun saveAppEntry() {
        context.dataStore.edit { settings ->
            settings[PreferenceKeys.APP_ENTRY] = true

        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences->
           preferences [PreferenceKeys.APP_ENTRY]?: false
        }
        }


}
private  val Context.dataStore:DataStore<Preferences> by preferencesDataStore(name =USER_SETTINGS)

private object PreferenceKeys {
    val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)

}