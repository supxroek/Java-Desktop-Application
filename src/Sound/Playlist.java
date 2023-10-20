package Sound;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Playlist {

    JFileChooser fc = new JFileChooser();
    ArrayList ls = new ArrayList();

    void add(JFrame frame) {
        fc.setMultiSelectionEnabled(true);
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int fileValid = fc.showOpenDialog(frame);
        if (fileValid == javax.swing.JFileChooser.CANCEL_OPTION) {
            return;
        } else if (fileValid == javax.swing.JFileChooser.APPROVE_OPTION) {
            File dir = fc.getSelectedFile();
            File[] files = dir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".mp3");
                }
            });
            ls.addAll(Arrays.asList(files));
        }
    }

    ArrayList getListSong() {
        return ls;
    }
    
//save playlist
    FileOutputStream fos;
    ObjectOutputStream oos;

    public void saveAsPlaylist(JFrame frame) {
        fc.setMultiSelectionEnabled(true);
        int Valid = fc.showOpenDialog(frame);
        if (Valid == javax.swing.JFileChooser.CANCEL_OPTION) {
            return;
        } else if (Valid == javax.swing.JFileChooser.APPROVE_OPTION) {
            File[] pls = fc.getSelectedFiles();
            try {
                fos = new FileOutputStream(pls + ".tgr");
                oos = new ObjectOutputStream(fos);

                for (int i = 0; i < ls.size(); i++) {
                    File tmp = (File) ls.get(i);
                    oos.writeObject(tmp);
                }
                oos.close();

            } catch (Exception e) {
            }
        }
    }

    FileInputStream fis;
    ObjectInputStream ois;

    public void openPls(JFrame frame) {
        fc.setMultiSelectionEnabled(false);
        int Valid = fc.showOpenDialog(frame);
        if (Valid == javax.swing.JFileChooser.CANCEL_OPTION) {
            return;
        }
        if (Valid == javax.swing.JFileChooser.APPROVE_OPTION) {
            File pls = fc.getSelectedFile();
            try {
                fis = new FileInputStream(pls);
                ois = new ObjectInputStream(fis);
                File tmp;
                while ((tmp = (File) ois.readObject()) != null) {
                    ls.add(tmp);
                }
                if ((tmp = (File) ois.readObject()) == null) {
                    ls.isEmpty();
                }
                ois.close();
            } catch (Exception e) {
            }
        }
    }
}
