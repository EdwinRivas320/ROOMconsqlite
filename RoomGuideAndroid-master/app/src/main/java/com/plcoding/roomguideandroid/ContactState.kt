package com.plcoding.roomguideandroid

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)
//esta clase ContactState se utiliza para almacenar y
// gestionar el estado de los contactos en una aplicación
// o sistema que involucra la manipulación de contactos.