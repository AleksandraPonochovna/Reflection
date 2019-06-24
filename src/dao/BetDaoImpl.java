package dao;

import db.Storage;
import lib.Dao;
import model.Bet;

import java.util.List;

//НАШ КЛАСС ДЛЯ РАБОТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦОЙ СТАВОК
@Dao
public class BetDaoImpl implements DaoInterface<Bet> {
    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
