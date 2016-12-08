package model.meta;

public interface GlobalOrderArchiveMssgs {
    void accept(GlobalOrderArchiveMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface GlobalOrderArchiveDOWNMssgs extends Mssgs, GlobalOrderArchiveMssgs{}
interface GlobalOrderArchiveUPMssgs extends Mssgs, GlobalOrderArchiveMssgs{}
