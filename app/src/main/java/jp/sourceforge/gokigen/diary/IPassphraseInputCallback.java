package jp.sourceforge.gokigen.diary;

public interface IPassphraseInputCallback
{
	/** データを入力した **/
    public abstract boolean inputPassphraseFinished(String data);

    /** 入力を中止した... **/
    public abstract void inputPassphraseCanceled();
}
