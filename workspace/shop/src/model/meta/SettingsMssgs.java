package model.meta;

public interface SettingsMssgs {
    void accept(SettingsMssgsVisitor visitor) throws persistence.PersistenceException;
}

interface SettingsDOWNMssgs extends Mssgs, SettingsMssgs{}
interface SettingsUPMssgs extends Mssgs, SettingsMssgs{}
