package Sound;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Playlist {

    private JFileChooser fileChooser;
    private ArrayList<File> songList;

    public Playlist() {
        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        songList = new ArrayList<>();
    }

    public void add(JFrame frame) {
        int fileValid = fileChooser.showOpenDialog(null); // Pass null as parent component to open the dialog.
        if (fileValid == JFileChooser.CANCEL_OPTION) {
            return;
        } else if (fileValid == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();
            File[] files = dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".mp3");
                }
            });
            if (files != null) {
                for (File file : files) {
                    songList.add(file);
                }
            }
        }
    }

    public ArrayList<File> getSongList() {
        return songList;
    }

}
