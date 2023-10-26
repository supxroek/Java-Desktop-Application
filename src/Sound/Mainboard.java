package Sound;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import jaco.mp3.player.MP3Player;

/**
 *
 * @author oaffa
 */
public class Mainboard extends javax.swing.JFrame {

    private MP3Player player;
    private final DefaultListModel<String> listModel; // Move listModel here
    private final Playlist pl; // Remove listModel from here
    private boolean isPlaying = false;
    private int isPause = 0;
    private int isCheck = 0;
    private File currentlyPlayingFile = null;

    public Mainboard() {
        initComponents();

        listModel = new DefaultListModel<>(); // Initialize listModel
        Music_list.setModel(listModel);
        pl = new Playlist(listModel); // Pass the listModel to the Playlist constructor

        // Load previously saved folder path when the user logs in
        String savedFolderPath = pl.getSavedFolderPath();
        if (savedFolderPath != null) {
            Locations_list.addItem(savedFolderPath);
        }

    }

    void playSelectedSong(int play) {
        int selectedIndex = play;
        if (selectedIndex != -1) {
            File selectedSongFile = pl.getSongList().get(selectedIndex);

            if (isCheck != 1) {
                if (isPause != 1) {
                    if (isPlaying) {
                        if (currentlyPlayingFile != null && !selectedSongFile.equals(currentlyPlayingFile)) {
                            player.stop();
                        }
                    }

                    player = new MP3Player(selectedSongFile);
                    player.play();

                    // ตรวจสอบเมื่อเพลงเล่นเสร็จ
                    Thread completionChecker = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (true) {
                                if (player.isStopped()) {
                                    playNextSong();
                                    break;
                                }
                                try {
                                    Thread.sleep(100); // ตรวจสอบสถานะทุก 100 มิลลิวินาที
                                } catch (InterruptedException e) {
                                }
                            }
                        }
                    });

                    completionChecker.start();

                    nameMusic.setText(selectedSongFile.getName());

                    currentlyPlayingFile = selectedSongFile;
                    isPlaying = true;
                    isCheck = 1;
                } else {
                    if (player.isPaused()) {
                        player.play();
                        isPause = 0;
                    }
                }
            }
        }
    }

    void changeSong() {
        int selectedIndex = Music_list.getSelectedIndex();
        if (selectedIndex != -1) {
            File selectedSongFile = pl.getSongList().get(selectedIndex);

            if (currentlyPlayingFile != null && !selectedSongFile.equals(currentlyPlayingFile)) {
                if (isPlaying) {
                    player.stop(); // หยุดเล่นเพลงที่กำลังเล่น
                    isCheck = 0; // รีเซ็ต isCheck เพื่อให้ผู้ใช้สามารถเล่นเพลงใหม่
                    isPause = 0; // รีเซ็ต isPause
                }
                playSelectedSong(selectedIndex);
            } else {
                if (isPlaying) {
                    isCheck = 0; // รีเซ็ต isCheck เพื่อให้ผู้ใช้สามารถเล่นเพลงใหม่
                    isPause = 1; // รีเซ็ต isPause
                }
                playSelectedSong(selectedIndex);
            }
        }
//        playSelectedSong(); // เรียกฟังก์ชันเล่นเพลงที่ผู้ใช้เลือก
    }

    void stop() {
        int selectedIndex = Music_list.getSelectedIndex();
        if (isPlaying) {
            if (selectedIndex != -1) {
                File selectedSongFile = pl.getSongList().get(selectedIndex);

                if (currentlyPlayingFile != null && !selectedSongFile.equals(currentlyPlayingFile)) {
                    player.stop();
                    isCheck = 0; // รีเซ็ต isCheck เพื่อให้ผู้ใช้สามารถเล่นเพลงใหม่
                    isPause = 0; // รีเซ็ต isPause
                } else {
                    player.pause();
                    isCheck = 0;
                    isPause = 1;
                }
            }
        }
    }

    void playRandomSong() {
        int randomIndex = (int) (Math.random() * pl.getSongList().size());
        if (!pl.getSongList().isEmpty()) {
            if (isPlaying) {
                player.stop();
            }
            Music_list.setSelectedIndex(randomIndex);
            isCheck = 0; // รีเซ็ต isCheck เพื่อให้ผู้ใช้สามารถเล่นเพลงใหม่
            isPause = 0; // รีเซ็ต isPause
        }
        playSelectedSong(randomIndex);
    }

    void playNextSong() {
        int selectedIndex = Music_list.getSelectedIndex();
        if (selectedIndex < pl.getSongList().size() - 1) {
            player.stop();
            Music_list.setSelectedIndex(selectedIndex + 1);
            isCheck = 0; // รีเซ็ต isCheck เพื่อให้ผู้ใช้สามารถเล่นเพลงใหม่
            isPause = 0; // รีเซ็ต isPause
        }
        playSelectedSong(selectedIndex + 1);
    }

    void playPreviousSong() {
        int selectedIndex = Music_list.getSelectedIndex();
        if (selectedIndex > 0) {
            player.stop();
            Music_list.setSelectedIndex(selectedIndex - 1);
            isCheck = 0; // รีเซ็ต isCheck เพื่อให้ผู้ใช้สามารถเล่นเพลงใหม่
            isPause = 0; // รีเซ็ต isPause
        }
        playSelectedSong(selectedIndex - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Slide_music = new javax.swing.JPanel();
        bg_Music = new javax.swing.JPanel();
        Music_btn = new javax.swing.JLabel();
        bg_Logout = new javax.swing.JPanel();
        Logout_btn = new javax.swing.JLabel();
        Slide_Logout = new javax.swing.JPanel();
        bg_Setting = new javax.swing.JPanel();
        Setting_btn = new javax.swing.JLabel();
        Slide_setting = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameMusic = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        bg_play = new javax.swing.JPanel();
        play_btn = new javax.swing.JLabel();
        bg_next = new javax.swing.JPanel();
        Next_btn = new javax.swing.JLabel();
        bg_back = new javax.swing.JPanel();
        Back_btn = new javax.swing.JLabel();
        bg_stop = new javax.swing.JPanel();
        Stop_btn = new javax.swing.JLabel();
        bg_random = new javax.swing.JPanel();
        Random_btn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Table_page = new javax.swing.JTabbedPane();
        Home_page = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Music_list = new javax.swing.JList<>();
        bg_upload = new javax.swing.JPanel();
        upload = new javax.swing.JLabel();
        Setting_page = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Locations_list = new javax.swing.JComboBox<>();
        Folder_locations = new javax.swing.JTextField();
        Add_btn = new javax.swing.JLabel();
        Delete_btn = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(153, 50, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(850, 50));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(62, 26, 85));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel7.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SOUND SCRATCH");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 670, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(147, 112, 219));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 450));

        Slide_music.setBackground(new java.awt.Color(147, 112, 219));
        Slide_music.setPreferredSize(new java.awt.Dimension(150, 3));

        javax.swing.GroupLayout Slide_musicLayout = new javax.swing.GroupLayout(Slide_music);
        Slide_music.setLayout(Slide_musicLayout);
        Slide_musicLayout.setHorizontalGroup(
            Slide_musicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Slide_musicLayout.setVerticalGroup(
            Slide_musicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        bg_Music.setBackground(new java.awt.Color(125, 95, 186));
        bg_Music.setPreferredSize(new java.awt.Dimension(150, 50));

        Music_btn.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        Music_btn.setForeground(new java.awt.Color(255, 255, 255));
        Music_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Music_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disc.png"))); // NOI18N
        Music_btn.setText("MUSIC");
        Music_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Music_btn.setPreferredSize(new java.awt.Dimension(39, 50));
        Music_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Music_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Music_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Music_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_MusicLayout = new javax.swing.GroupLayout(bg_Music);
        bg_Music.setLayout(bg_MusicLayout);
        bg_MusicLayout.setHorizontalGroup(
            bg_MusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_MusicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Music_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_MusicLayout.setVerticalGroup(
            bg_MusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_MusicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Music_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_Logout.setBackground(new java.awt.Color(147, 112, 219));

        Logout_btn.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        Logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        Logout_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        Logout_btn.setText("LOGOUT");
        Logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_LogoutLayout = new javax.swing.GroupLayout(bg_Logout);
        bg_Logout.setLayout(bg_LogoutLayout);
        bg_LogoutLayout.setHorizontalGroup(
            bg_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_LogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bg_LogoutLayout.setVerticalGroup(
            bg_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_LogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout_btn)
                .addContainerGap())
        );

        Slide_Logout.setPreferredSize(new java.awt.Dimension(150, 3));

        javax.swing.GroupLayout Slide_LogoutLayout = new javax.swing.GroupLayout(Slide_Logout);
        Slide_Logout.setLayout(Slide_LogoutLayout);
        Slide_LogoutLayout.setHorizontalGroup(
            Slide_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Slide_LogoutLayout.setVerticalGroup(
            Slide_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        bg_Setting.setBackground(new java.awt.Color(147, 112, 219));
        bg_Setting.setPreferredSize(new java.awt.Dimension(150, 50));

        Setting_btn.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        Setting_btn.setForeground(new java.awt.Color(255, 255, 255));
        Setting_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Setting_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings.png"))); // NOI18N
        Setting_btn.setText("SETTING");
        Setting_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Setting_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Setting_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Setting_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_SettingLayout = new javax.swing.GroupLayout(bg_Setting);
        bg_Setting.setLayout(bg_SettingLayout);
        bg_SettingLayout.setHorizontalGroup(
            bg_SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_SettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Setting_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_SettingLayout.setVerticalGroup(
            bg_SettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_SettingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Setting_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        Slide_setting.setBackground(new java.awt.Color(147, 112, 219));
        Slide_setting.setPreferredSize(new java.awt.Dimension(150, 3));

        javax.swing.GroupLayout Slide_settingLayout = new javax.swing.GroupLayout(Slide_setting);
        Slide_setting.setLayout(Slide_settingLayout);
        Slide_settingLayout.setHorizontalGroup(
            Slide_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Slide_settingLayout.setVerticalGroup(
            Slide_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bg_Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Slide_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bg_Music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slide_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bg_Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Slide_setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(bg_Music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Slide_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bg_Setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Slide_setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(Slide_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bg_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(225, 225, 248));
        jPanel7.setPreferredSize(new java.awt.Dimension(850, 100));

        jPanel5.setBackground(new java.awt.Color(225, 225, 248));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/album (1).png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel5.setText("Unknown album");

        nameMusic.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        nameMusic.setText("Artist-Unknown");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameMusic)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(237, 241, 250));
        jPanel6.setPreferredSize(new java.awt.Dimension(645, 100));

        jPanel8.setBackground(new java.awt.Color(237, 241, 250));

        bg_play.setBackground(new java.awt.Color(237, 241, 250));
        bg_play.setPreferredSize(new java.awt.Dimension(40, 40));

        play_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play-button.png"))); // NOI18N
        play_btn.setPreferredSize(new java.awt.Dimension(40, 40));
        play_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                play_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                play_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_playLayout = new javax.swing.GroupLayout(bg_play);
        bg_play.setLayout(bg_playLayout);
        bg_playLayout.setHorizontalGroup(
            bg_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_playLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(play_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bg_playLayout.setVerticalGroup(
            bg_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_playLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(play_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg_next.setBackground(new java.awt.Color(237, 241, 250));
        bg_next.setPreferredSize(new java.awt.Dimension(40, 40));

        Next_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Next_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        Next_btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Next_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Next_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Next_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Next_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_nextLayout = new javax.swing.GroupLayout(bg_next);
        bg_next.setLayout(bg_nextLayout);
        bg_nextLayout.setHorizontalGroup(
            bg_nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_nextLayout.createSequentialGroup()
                .addComponent(Next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bg_nextLayout.setVerticalGroup(
            bg_nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_nextLayout.createSequentialGroup()
                .addComponent(Next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg_back.setBackground(new java.awt.Color(237, 241, 250));
        bg_back.setPreferredSize(new java.awt.Dimension(40, 40));

        Back_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        Back_btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Back_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Back_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_backLayout = new javax.swing.GroupLayout(bg_back);
        bg_back.setLayout(bg_backLayout);
        bg_backLayout.setHorizontalGroup(
            bg_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_backLayout.createSequentialGroup()
                .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bg_backLayout.setVerticalGroup(
            bg_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg_stop.setBackground(new java.awt.Color(237, 241, 250));
        bg_stop.setPreferredSize(new java.awt.Dimension(40, 40));

        Stop_btn.setBackground(new java.awt.Color(237, 241, 250));
        Stop_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stop_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        Stop_btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Stop_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stop_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stop_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stop_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_stopLayout = new javax.swing.GroupLayout(bg_stop);
        bg_stop.setLayout(bg_stopLayout);
        bg_stopLayout.setHorizontalGroup(
            bg_stopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stop_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg_stopLayout.setVerticalGroup(
            bg_stopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stop_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg_random.setBackground(new java.awt.Color(237, 241, 250));
        bg_random.setPreferredSize(new java.awt.Dimension(40, 40));

        Random_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Random_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/random.png"))); // NOI18N
        Random_btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Random_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Random_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Random_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Random_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_randomLayout = new javax.swing.GroupLayout(bg_random);
        bg_random.setLayout(bg_randomLayout);
        bg_randomLayout.setHorizontalGroup(
            bg_randomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_randomLayout.createSequentialGroup()
                .addComponent(Random_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bg_randomLayout.setVerticalGroup(
            bg_randomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Random_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(bg_random, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(bg_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bg_play, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bg_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(bg_stop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bg_random, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg_stop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bg_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bg_play, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bg_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home_page.setBackground(new java.awt.Color(245, 245, 245));
        Home_page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        Music_list.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(Music_list);

        Home_page.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 700, 300));

        upload.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        upload.setForeground(new java.awt.Color(102, 102, 102));
        upload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inbox.png"))); // NOI18N
        upload.setText("Upload");
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uploadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uploadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_uploadLayout = new javax.swing.GroupLayout(bg_upload);
        bg_upload.setLayout(bg_uploadLayout);
        bg_uploadLayout.setHorizontalGroup(
            bg_uploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_uploadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bg_uploadLayout.setVerticalGroup(
            bg_uploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_uploadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Home_page.add(bg_upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 90, -1));

        Table_page.addTab("tab1", Home_page);

        Setting_page.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(237, 241, 250));

        jLabel6.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        jLabel6.setText("Music libary locations");

        Locations_list.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Folder_locations.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        Folder_locations.setBorder(null);

        Add_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-button.png"))); // NOI18N
        Add_btn.setPreferredSize(new java.awt.Dimension(25, 25));
        Add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_btnMouseClicked(evt);
            }
        });

        Delete_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        Delete_btn.setPreferredSize(new java.awt.Dimension(25, 25));
        Delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Folder_locations, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addComponent(Locations_list, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Folder_locations, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Locations_list)
                    .addComponent(Delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(237, 241, 250));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Setting_page.add(jPanel10, java.awt.BorderLayout.CENTER);

        Table_page.addTab("tab2", Setting_page);

        jPanel4.add(Table_page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 700, 380));

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecoler(JPanel h1, Color coler) {
        h1.setBackground(coler);
    }

    public void checkslide(JPanel p1, JPanel p2, int n_check) {
        if (n_check == 1) {
            p1.setBackground(new Color(125, 95, 186));
            p2.setBackground(new Color(147, 112, 219));
        } else {
            p1.setBackground(new Color(147, 112, 219));
            p2.setBackground(new Color(125, 95, 186));
        }
    }

    private int xMouse, yMouse;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Music_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Music_btnMouseClicked
        Table_page.setSelectedComponent(Home_page);
        checkslide(bg_Music, bg_Setting, 1);
    }//GEN-LAST:event_Music_btnMouseClicked

    private void Logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_btnMouseClicked
        new Login().setVisible(true);
        if (isPlaying) {
            player.stop();
        }
        this.dispose();
    }//GEN-LAST:event_Logout_btnMouseClicked

    private void Music_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Music_btnMouseEntered
        changecoler(Slide_music, new Color(242, 242, 242));
    }//GEN-LAST:event_Music_btnMouseEntered

    private void Music_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Music_btnMouseExited
        changecoler(Slide_music, new Color(147, 112, 219));
    }//GEN-LAST:event_Music_btnMouseExited

    private void uploadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseEntered
        changecoler(bg_upload, new Color(224, 238, 249));
    }//GEN-LAST:event_uploadMouseEntered

    private void uploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseExited
        changecoler(bg_upload, new Color(245, 245, 245));
    }//GEN-LAST:event_uploadMouseExited

    private void Next_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next_btnMouseEntered
        changecoler(bg_next, new Color(225, 225, 248));
    }//GEN-LAST:event_Next_btnMouseEntered

    private void Next_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next_btnMouseExited
        changecoler(bg_next, new Color(237, 241, 250));
    }//GEN-LAST:event_Next_btnMouseExited

    private void Back_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseEntered
        changecoler(bg_back, new Color(225, 225, 248));
    }//GEN-LAST:event_Back_btnMouseEntered

    private void Back_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseExited
        changecoler(bg_back, new Color(237, 241, 250));
    }//GEN-LAST:event_Back_btnMouseExited

    private void Stop_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop_btnMouseEntered
        changecoler(bg_stop, new Color(225, 225, 248));
    }//GEN-LAST:event_Stop_btnMouseEntered

    private void Stop_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop_btnMouseExited
        changecoler(bg_stop, new Color(237, 241, 250));
    }//GEN-LAST:event_Stop_btnMouseExited

    private void Random_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Random_btnMouseEntered
        changecoler(bg_random, new Color(225, 225, 248));
    }//GEN-LAST:event_Random_btnMouseEntered

    private void Random_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Random_btnMouseExited
        changecoler(bg_random, new Color(237, 241, 250));
    }//GEN-LAST:event_Random_btnMouseExited

    private void play_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_btnMouseEntered
        changecoler(bg_play, new Color(225, 225, 248));
    }//GEN-LAST:event_play_btnMouseEntered

    private void play_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_btnMouseExited
        changecoler(bg_play, new Color(237, 241, 250));
    }//GEN-LAST:event_play_btnMouseExited

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        pl.add(this); // เรียกเมธอด add() ในคลาส Playlist
        ArrayList<String> folderPaths = pl.getAddedFolders();  // ดึงที่อยู่โฟลเดอร์ที่เพิ่มเข้ามาจาก Playlist

        for (String folderPath : folderPaths) {
            // ตรวจสอบว่าที่อยู่โฟลเดอร์มีอยู่ใน Locations_list หรือไม่
            boolean folderExists = false;
            for (int i = 0; i < Locations_list.getItemCount(); i++) {
                if (folderPath.equals(Locations_list.getItemAt(i))) {
                    folderExists = true;
                    break;
                }
            }

            if (!folderExists) {
                Locations_list.addItem(folderPath); // เพิ่มที่อยู่โฟลเดอร์ใน Locations_list
                pl.updateList(); // อัพเดทรายการเพลง
            } else {
                // ที่อยู่โฟลเดอร์มีอยู่แล้ว
                // คุณสามารถแจ้งเตือนหรือไม่ทำอะไรตามความต้องการ
            }
        }
    }//GEN-LAST:event_uploadMouseClicked

    private void play_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_btnMouseClicked
        changeSong();
    }//GEN-LAST:event_play_btnMouseClicked

    private void Stop_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stop_btnMouseClicked
        stop();
    }//GEN-LAST:event_Stop_btnMouseClicked

    private void Next_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next_btnMouseClicked
        playNextSong();
    }//GEN-LAST:event_Next_btnMouseClicked

    private void Back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseClicked
        playPreviousSong();
    }//GEN-LAST:event_Back_btnMouseClicked

    private void Random_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Random_btnMouseClicked
        playRandomSong();
    }//GEN-LAST:event_Random_btnMouseClicked

    private void Setting_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting_btnMouseClicked
        Table_page.setSelectedComponent(Setting_page);
        checkslide(bg_Setting, bg_Music, 1);
    }//GEN-LAST:event_Setting_btnMouseClicked

    private void Setting_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting_btnMouseEntered
        changecoler(Slide_setting, new Color(242, 242, 242));
    }//GEN-LAST:event_Setting_btnMouseEntered

    private void Setting_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting_btnMouseExited
        changecoler(Slide_setting, new Color(147, 112, 219));
    }//GEN-LAST:event_Setting_btnMouseExited

    private void Add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btnMouseClicked
        String folderPath = Folder_locations.getText(); // Assuming Folder_locations is the JTextField for folder path

        // Check if the folder path already exists in the list
        boolean folderExists = false;
        for (int i = 0; i < Locations_list.getItemCount(); i++) {
            if (Locations_list.getItemAt(i).equals(folderPath)) {
                folderExists = true;
                break;
            }
        }

        if (!folderExists) {
            Locations_list.addItem(folderPath);
            pl.setDefaultFolderPath(folderPath);
            pl.updateList();
        }
    }//GEN-LAST:event_Add_btnMouseClicked

    private void Delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_btnMouseClicked
        String selectedFolder = Locations_list.getSelectedItem().toString();
        Locations_list.removeItemAt(Locations_list.getSelectedIndex());

        // Remove songs associated with the deleted folder
        ArrayList<File> songsToRemove = new ArrayList<>();
        for (File song : pl.getSongList()) {
            if (song.getAbsolutePath().startsWith(selectedFolder)) {
                songsToRemove.add(song);
            }
        }
        pl.getSongList().removeAll(songsToRemove);
        pl.updateList();
    }//GEN-LAST:event_Delete_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_btn;
    private javax.swing.JLabel Back_btn;
    private javax.swing.JLabel Delete_btn;
    private javax.swing.JTextField Folder_locations;
    private javax.swing.JPanel Home_page;
    private javax.swing.JComboBox<String> Locations_list;
    private javax.swing.JLabel Logout_btn;
    private javax.swing.JLabel Music_btn;
    private javax.swing.JList<String> Music_list;
    private javax.swing.JLabel Next_btn;
    private javax.swing.JLabel Random_btn;
    private javax.swing.JLabel Setting_btn;
    private javax.swing.JPanel Setting_page;
    private javax.swing.JPanel Slide_Logout;
    private javax.swing.JPanel Slide_music;
    private javax.swing.JPanel Slide_setting;
    private javax.swing.JLabel Stop_btn;
    private javax.swing.JTabbedPane Table_page;
    private javax.swing.JPanel bg_Logout;
    private javax.swing.JPanel bg_Music;
    private javax.swing.JPanel bg_Setting;
    private javax.swing.JPanel bg_back;
    private javax.swing.JPanel bg_next;
    private javax.swing.JPanel bg_play;
    private javax.swing.JPanel bg_random;
    private javax.swing.JPanel bg_stop;
    private javax.swing.JPanel bg_upload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameMusic;
    private javax.swing.JLabel play_btn;
    private javax.swing.JLabel upload;
    // End of variables declaration//GEN-END:variables
}
