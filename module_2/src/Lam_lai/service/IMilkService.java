package Lam_lai.service;

import Lam_lai.model.Milk;

import java.util.List;

public interface IMilkService {
    List<Milk> list();

    void findAdd(Milk milk1);

}
