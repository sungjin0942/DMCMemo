package com.example.dmc1memo.data

import androidx.lifecycle.ViewModel
import io.realm.Realm


class ListViewModel : ViewModel() {
    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }

    private val memoDao: MemoDao by lazy {
        MemoDao(realm)
    }
    val memoLiveData: RealmLiveData<MemoData> by lazy {
        RealmLiveData(memoDao.getAllMemos())
    }

    override fun onCleared() {
        super.onCleared()
        realm.close()
    }



}