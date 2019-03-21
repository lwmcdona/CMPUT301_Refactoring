package ca.ualberta.cs.busytwitter;

import java.io.IOException;

public abstract class ReaderWriter {
    protected abstract void writeObject(java.io.ObjectOutputStream out) throws IOException;

    protected abstract void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException;
}
