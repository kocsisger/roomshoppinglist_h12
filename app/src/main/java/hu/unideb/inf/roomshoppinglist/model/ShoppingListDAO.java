package hu.unideb.inf.roomshoppinglist.model;

import androidx.room.Dao;

@Dao
public interface ShoppingListDAO {
    void insertListItem(ShoppingListI);
}
