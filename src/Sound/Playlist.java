package Sound;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.prefs.Preferences;
import javax.swing.JFrame;
import javax.swing.DefaultListModel;

public class Playlist {

    private final JFileChooser fileChooser;
    private final ArrayList<File> songList;
    private final Preferences preferences;
    private final DefaultListModel<String> listModel;  // Add a reference to the listModel
    private ArrayList<String> addedFolders = new ArrayList<>();

    public Playlist(DefaultListModel<String> listModel) {  // Pass listModel as a parameter
        fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        songList = new ArrayList<>();
        preferences = Preferences.userNodeForPackage(this.getClass());
        this.listModel = listModel;  // Initialize the listModel

        // Load the saved folder path from preferences
        String savedFolderPath = preferences.get("folderPath", null);
        if (savedFolderPath != null) {
            loadSongsFromFolder(new File(savedFolderPath));
        }
    }

    public void add(JFrame frame) {
        int fileValid = fileChooser.showOpenDialog(null);
        if (fileValid == JFileChooser.CANCEL_OPTION) {
            return;
        } else if (fileValid == JFileChooser.APPROVE_OPTION) {
            File dir = fileChooser.getSelectedFile();

            // Check if the folderPath has been previously added
            String folderPath = preferences.get("folderPath", null);
            if (folderPath != null && folderPath.equals(dir.getAbsolutePath())) {
                // The folderPath is already in preferences
                // You can handle this case as needed (e.g., show a notification)
            } else {
                addedFolders.add(folderPath);
                saveFolderPathToPreferences(dir);
                loadSongsFromFolder(dir);
                updateList();
            }
        }
    }

    public String getSavedFolderPath() {
        String savedFolderPath = preferences.get("folderPath", null);
        return savedFolderPath;
    }

    public ArrayList<String> getAddedFolders() {
        return addedFolders;
    }

    private void saveFolderPathToPreferences(File folder) {
        // Save the selected folder path to preferences
        preferences.put("folderPath", folder.getAbsolutePath());
    }
    
    public ArrayList<File> getSongList() {
        return songList;
    }

    private void loadSongsFromFolder(File folder) {
        File[] files = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".mp3");
            }
        });
        if (files != null) {
            for (File file : files) {
                songList.add(file);
                updateList();
            }
        }
    }

    public void setDefaultFolderPath(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            saveFolderPathToPreferences(folder);
            loadSongsFromFolder(folder);
            updateList(); // Update the list after setting the default folder path
        }
    }

    public void updateList() {
        listModel.clear();
        ArrayList<File> updateList = getSongList();
        for (int i = 0; i < updateList.size(); i++) {
            int j = i + 1;
            listModel.addElement(j + " | " + updateList.get(i).getName());
        }
    }

    public String getFolderPath() {
        if (!songList.isEmpty()) {
            return songList.get(songList.size() - 1).getParent(); // เราใช้ที่อยู่ของไฟล์ล่าสุดในรายการ
        } else {
            return null; // ถ้ารายการว่างเปล่าเราจะคืนค่า null
        }
    }

}
