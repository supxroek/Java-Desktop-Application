/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sound;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;

/**
 *
 * @author oaffa
 */
public class Mainboard extends javax.swing.JFrame {

    Playlist pl = new Playlist();
    ArrayList updateList = new ArrayList();
    javazoom.jl.player.Player player;

    public Mainboard() {
        initComponents();
    }

    void updateList() {
        updateList = pl.getListSong();
        DefaultListModel dm = new DefaultListModel();
        for (int i = 0; i < updateList.size(); i++) {
            int j = i + 1;
            dm.add(i, j + " | " + ((File) updateList.get(i)).getName());
        }
        Music_list.setModel(dm);
    }

    void add() {
        pl.add(this);
        updateList();
    }

    void open() {
        pl.openPls(this);
        updateList();
    }

    File play;
    static int n = 0;

   void play_music() {
        if (play_btn.isSelected()) {
            if (n == 0) {
                try {
                    int ml = Music_list.getSelectedIndex();
                    play = (File) this.updateList.get(ml);
                    FileInputStream fs = new FileInputStream(play);
                    BufferedInputStream bs = new BufferedInputStream(fs);
                    player = new javazoom.jl.player.Player(bs);
                    n = 1;
                } catch (Exception e) {
                    System.out.println("Problem playing file");
                    System.out.println(e);
                }

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            player.play();
                        } catch (Exception e) {
                        }
                    }
                }.start();
            }
        } else {
            player.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Slide_home = new javax.swing.JPanel();
        Slide_music = new javax.swing.JPanel();
        bg_home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bg_Music = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jPanel8 = new javax.swing.JPanel();
        bg_play = new javax.swing.JPanel();
        play_btn = new javax.swing.JToggleButton();
        bg_next = new javax.swing.JPanel();
        Next_btn = new javax.swing.JLabel();
        bg_back = new javax.swing.JPanel();
        Back_btn = new javax.swing.JLabel();
        bg_replay = new javax.swing.JPanel();
        Replay_btn = new javax.swing.JLabel();
        bg_random = new javax.swing.JPanel();
        Random_btn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Table_page = new javax.swing.JTabbedPane();
        Home_page = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Music_list = new javax.swing.JList<>();
        bg_upload = new javax.swing.JPanel();
        upload = new javax.swing.JLabel();
        Music_page = new javax.swing.JPanel();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(820, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(147, 112, 219));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 450));

        Slide_home.setBackground(new java.awt.Color(147, 112, 219));
        Slide_home.setPreferredSize(new java.awt.Dimension(150, 3));

        javax.swing.GroupLayout Slide_homeLayout = new javax.swing.GroupLayout(Slide_home);
        Slide_home.setLayout(Slide_homeLayout);
        Slide_homeLayout.setHorizontalGroup(
            Slide_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        Slide_homeLayout.setVerticalGroup(
            Slide_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

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

        bg_home.setBackground(new java.awt.Color(147, 112, 219));

        jLabel2.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jLabel2.setText("HOME");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setPreferredSize(new java.awt.Dimension(39, 50));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_homeLayout = new javax.swing.GroupLayout(bg_home);
        bg_home.setLayout(bg_homeLayout);
        bg_homeLayout.setHorizontalGroup(
            bg_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_homeLayout.setVerticalGroup(
            bg_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg_Music.setBackground(new java.awt.Color(147, 112, 219));

        jLabel3.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disc.png"))); // NOI18N
        jLabel3.setText("MUSIC");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_MusicLayout = new javax.swing.GroupLayout(bg_Music);
        bg_Music.setLayout(bg_MusicLayout);
        bg_MusicLayout.setHorizontalGroup(
            bg_MusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_MusicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        bg_MusicLayout.setVerticalGroup(
            bg_MusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_MusicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Slide_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Slide_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bg_Music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(bg_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(bg_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Slide_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bg_Music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Slide_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
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

        jLabel6.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel6.setText("Artist-Unknown");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(237, 241, 250));
        jPanel6.setPreferredSize(new java.awt.Dimension(645, 100));

        jSlider1.setPreferredSize(new java.awt.Dimension(500, 20));

        jPanel8.setBackground(new java.awt.Color(237, 241, 250));

        bg_play.setBackground(new java.awt.Color(237, 241, 250));
        bg_play.setPreferredSize(new java.awt.Dimension(40, 40));

        play_btn.setBackground(new java.awt.Color(237, 241, 250));
        play_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play-button.png"))); // NOI18N
        play_btn.setBorder(null);
        play_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        play_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_playLayout = new javax.swing.GroupLayout(bg_play);
        bg_play.setLayout(bg_playLayout);
        bg_playLayout.setHorizontalGroup(
            bg_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(play_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        bg_playLayout.setVerticalGroup(
            bg_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(play_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
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

        bg_replay.setBackground(new java.awt.Color(237, 241, 250));
        bg_replay.setPreferredSize(new java.awt.Dimension(40, 40));

        Replay_btn.setBackground(new java.awt.Color(237, 241, 250));
        Replay_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Replay_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loop-arrow.png"))); // NOI18N
        Replay_btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Replay_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Replay_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Replay_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Replay_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bg_replayLayout = new javax.swing.GroupLayout(bg_replay);
        bg_replay.setLayout(bg_replayLayout);
        bg_replayLayout.setHorizontalGroup(
            bg_replayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Replay_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg_replayLayout.setVerticalGroup(
            bg_replayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Replay_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg_replay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bg_random, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg_replay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bg_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bg_play, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bg_next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
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

        jScrollPane1.setViewportView(Music_list);

        Home_page.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 700, 305));

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

        Music_page.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Music_pageLayout = new javax.swing.GroupLayout(Music_page);
        Music_page.setLayout(Music_pageLayout);
        Music_pageLayout.setHorizontalGroup(
            Music_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        Music_pageLayout.setVerticalGroup(
            Music_pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        Table_page.addTab("tab2", Music_page);

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
            p1.setBackground(new Color(218, 112, 214));
            p2.setBackground(new Color(147, 112, 219));
        } else {
            p1.setBackground(new Color(147, 112, 219));
            p2.setBackground(new Color(218, 112, 214));
        }
    }

    private int xMouse, yMouse;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        Table_page.setSelectedComponent(Home_page);
        checkslide(bg_home, bg_Music, 1);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Table_page.setSelectedComponent(Music_page);
        checkslide(bg_Music, bg_home, 1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        changecoler(Slide_home, new Color(218, 112, 214));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        changecoler(Slide_music, new Color(218, 112, 214));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        changecoler(Slide_home, new Color(147, 112, 219));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        changecoler(Slide_music, new Color(147, 112, 219));
    }//GEN-LAST:event_jLabel3MouseExited

    private void uploadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseEntered
        // TODO add your handling code here:
        changecoler(bg_upload, new Color(224, 238, 249));
    }//GEN-LAST:event_uploadMouseEntered

    private void uploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseExited
        // TODO add your handling code here:
        changecoler(bg_upload, new Color(245, 245, 245));
    }//GEN-LAST:event_uploadMouseExited

    private void Next_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next_btnMouseEntered
        // TODO add your handling code here:
        changecoler(bg_next, new Color(225, 225, 248));
    }//GEN-LAST:event_Next_btnMouseEntered

    private void Next_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next_btnMouseExited
        // TODO add your handling code here:
        changecoler(bg_next, new Color(237, 241, 250));
    }//GEN-LAST:event_Next_btnMouseExited

    private void Back_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseEntered
        // TODO add your handling code here:
        changecoler(bg_back, new Color(225, 225, 248));
    }//GEN-LAST:event_Back_btnMouseEntered

    private void Back_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseExited
        // TODO add your handling code here:
        changecoler(bg_back, new Color(237, 241, 250));
    }//GEN-LAST:event_Back_btnMouseExited

    private void Replay_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Replay_btnMouseEntered
        // TODO add your handling code here:
        changecoler(bg_replay, new Color(225, 225, 248));
    }//GEN-LAST:event_Replay_btnMouseEntered

    private void Replay_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Replay_btnMouseExited
        // TODO add your handling code here:
        changecoler(bg_replay, new Color(237, 241, 250));
    }//GEN-LAST:event_Replay_btnMouseExited

    private void Random_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Random_btnMouseEntered
        // TODO add your handling code here:
        changecoler(bg_random, new Color(225, 225, 248));
    }//GEN-LAST:event_Random_btnMouseEntered

    private void Random_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Random_btnMouseExited
        // TODO add your handling code here:
        changecoler(bg_random, new Color(237, 241, 250));
    }//GEN-LAST:event_Random_btnMouseExited

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        add();
    }//GEN-LAST:event_uploadMouseClicked

    private void Next_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next_btnMouseClicked

    }//GEN-LAST:event_Next_btnMouseClicked

    private void Back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_btnMouseClicked

    private void Replay_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Replay_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Replay_btnMouseClicked

    private void Random_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Random_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Random_btnMouseClicked

    private void play_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_btnActionPerformed
        play_music();
    }//GEN-LAST:event_play_btnActionPerformed

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
    private javax.swing.JLabel Back_btn;
    private javax.swing.JPanel Home_page;
    private javax.swing.JList<String> Music_list;
    private javax.swing.JPanel Music_page;
    private javax.swing.JLabel Next_btn;
    private javax.swing.JLabel Random_btn;
    private javax.swing.JLabel Replay_btn;
    private javax.swing.JPanel Slide_home;
    private javax.swing.JPanel Slide_music;
    private javax.swing.JTabbedPane Table_page;
    private javax.swing.JPanel bg_Music;
    private javax.swing.JPanel bg_back;
    private javax.swing.JPanel bg_home;
    private javax.swing.JPanel bg_next;
    private javax.swing.JPanel bg_play;
    private javax.swing.JPanel bg_random;
    private javax.swing.JPanel bg_replay;
    private javax.swing.JPanel bg_upload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton play_btn;
    private javax.swing.JLabel upload;
    // End of variables declaration//GEN-END:variables
}
