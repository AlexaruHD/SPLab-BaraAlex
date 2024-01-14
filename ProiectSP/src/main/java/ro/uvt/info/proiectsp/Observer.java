package ro.uvt.info.proiectsp;

import java.io.IOException;

public interface Observer {
    void update(Book book) throws IOException;
}