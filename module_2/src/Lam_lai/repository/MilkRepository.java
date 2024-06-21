package Lam_lai.repository;

import Lam_lai.common.ReadWriteFile;
import Lam_lai.model.Milk;

import java.util.ArrayList;
import java.util.List;

public class MilkRepository implements IMilkRepository {
    private final ReadWriteFile readWriteFile = new ReadWriteFile();

    @Override
    public List<Milk> list() {
        return readWriteFile.readFileMilk();
    }

    @Override
    public void findAdd() {
        List<Milk> milkList = readWriteFile.readFileMilk();
        for (Milk milk : milkList) {
            
        }
    }
}
