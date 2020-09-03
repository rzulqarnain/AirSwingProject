package gui;

import data.aircraft.Airbus;
import data.aircraft.Aircraft;
import static data.aircraft.Aircraft.getModels;
import data.aircraft.Boeing;
import data.booking.Booking;
import data.destination.Destination;
import data.flight.Flight;
import data.route.Route;
import data.passenger.Adult;
import data.passenger.Child;
import data.passenger.Passenger;
import static java.awt.EventQueue.invokeLater;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.lang.Integer;
import java.lang.String;
import utilities.FileUtils;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import operations.DohaAir;

public class GUI extends javax.swing.JFrame {

    DohaAir dohaAir = new DohaAir();
    Graphics g;
    Image mapImage;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw();
    }

    public GUI() {
        initComponents();
        g = pnlMap.getGraphics();
        try {
            mapImage = ImageIO.read(new URL("file:src/map.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
//      create-objects code (comment all this code out)
//        
        message(dohaAir.create(new Adult("Ali", 111111)));
        message(dohaAir.create(new Adult("Mariam", 222222)));
        message(dohaAir.create(new Child("Efram", true)));
        message(dohaAir.create(new Child("Sarah", false)));

        message(dohaAir.create(new Boeing("001", "747")));
        message(dohaAir.create(new Boeing("002", "777")));
        message(dohaAir.create(new Airbus("003", "A320")));
        message(dohaAir.create(new Airbus("004", "A320")));

        message(dohaAir.create(new Destination("DOH", "Doha", 204,163)));
        message(dohaAir.create(new Destination("AUH", "Abu Dhabi", 382,225)));
        message(dohaAir.create(new Destination("DXB", "Dubai", 462,156)));

        message(dohaAir.create(new Route(dohaAir.findDestination("DOH"), dohaAir.findDestination("DXB"), 1500)));
        message(dohaAir.create(new Route(dohaAir.findDestination("DXB"), dohaAir.findDestination("DOH"), 1500)));
        message(dohaAir.create(new Route(dohaAir.findDestination("DOH"), dohaAir.findDestination("AUH"), 1000)));
        message(dohaAir.create(new Route(dohaAir.findDestination("AUH"), dohaAir.findDestination("DOH"), 1000)));

        message(dohaAir.schedule(new Flight("111", dohaAir.findAircraft("001"), dohaAir.findRoute("DOH-DXB"), "9:00AM")));
        message(dohaAir.schedule(new Flight("112", dohaAir.findAircraft("001"), dohaAir.findRoute("DXB-DOH"), "11:00AM")));
        message(dohaAir.schedule(new Flight("211", dohaAir.findAircraft("003"), dohaAir.findRoute("DOH-AUH"), "9:00AM")));
        message(dohaAir.schedule(new Flight("212", dohaAir.findAircraft("003"), dohaAir.findRoute("AUH-DOH"), "11:00AM")));

        message(dohaAir.book(new Booking(dohaAir.findPassenger("Ali"), dohaAir.findFlight("111"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Mariam"), dohaAir.findFlight("111"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Efram"), dohaAir.findFlight("111"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Sarah"), dohaAir.findFlight("111"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Ali"), dohaAir.findFlight("112"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Mariam"), dohaAir.findFlight("112"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Efram"), dohaAir.findFlight("112"))));
        message(dohaAir.book(new Booking(dohaAir.findPassenger("Sarah"), dohaAir.findFlight("112"))));
//
//        end of create-objects code (comment all this code out)

        update();
    }

    private void draw() {
        g.drawImage(mapImage, 0, 0, null);
        dohaAir.draw(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOut = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        rdoListAll = new javax.swing.JButton();
        rdoPassengers = new javax.swing.JRadioButton();
        rdoAircraft = new javax.swing.JRadioButton();
        rdoDestinations = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        cboPassengers2 = new javax.swing.JComboBox();
        btnItinerary = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cboFlightNumbers2 = new javax.swing.JComboBox();
        btnManifest = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cboAircraft2 = new javax.swing.JComboBox();
        btnSchedule = new javax.swing.JButton();
        rdoFlights = new javax.swing.JRadioButton();
        rdoBookings = new javax.swing.JRadioButton();
        rdoRoutes = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        cboPassengers3 = new javax.swing.JComboBox();
        btnPointsHistory = new javax.swing.JButton();
        pnlRoutes = new javax.swing.JPanel();
        pnlMap = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnBookPassengerOnFlight = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cboPassengers1 = new javax.swing.JComboBox();
        cboFlightNumbers1 = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnCheckIn = new javax.swing.JButton();
        cboBookings = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnCreateAircraft = new javax.swing.JButton();
        cboModel = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        cboManufacturer = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCreateDestination = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMapX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMapY = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cboFrom = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        cboTo = new javax.swing.JComboBox();
        btnCreateRoute = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPoints = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cboAircraft1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        cboRoutes = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        btnScheduleFlight = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPassengerName = new javax.swing.JTextField();
        btnCreatePassenger = new javax.swing.JButton();
        rdoAdult = new javax.swing.JRadioButton();
        rdoChild = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtFFN = new javax.swing.JTextField();
        chkCrib = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtOut.setColumns(20);
        txtOut.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtOut.setRows(5);
        jScrollPane1.setViewportView(txtOut);

        jPanel4.setBackground(java.awt.SystemColor.scrollbar);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Reports"));

        rdoListAll.setText("List");
        rdoListAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoListAllActionPerformed(evt);
            }
        });

        rdoPassengers.setBackground(java.awt.SystemColor.scrollbar);
        buttonGroup3.add(rdoPassengers);
        rdoPassengers.setSelected(true);
        rdoPassengers.setText("Passengers");

        rdoAircraft.setBackground(java.awt.SystemColor.scrollbar);
        buttonGroup3.add(rdoAircraft);
        rdoAircraft.setText("Aircraft");

        rdoDestinations.setBackground(java.awt.SystemColor.scrollbar);
        buttonGroup3.add(rdoDestinations);
        rdoDestinations.setText("Destinations");

        jLabel13.setText("Passenger");

        btnItinerary.setText("List Bookings (Itinerary)");
        btnItinerary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItineraryActionPerformed(evt);
            }
        });

        jLabel14.setText("Flight Number");

        btnManifest.setText("List Passengers (Manifest)");
        btnManifest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManifestActionPerformed(evt);
            }
        });

        jLabel15.setText("Aircraft ID");

        btnSchedule.setText("List Flights (Schedule)");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        rdoFlights.setBackground(java.awt.SystemColor.scrollbar);
        buttonGroup3.add(rdoFlights);
        rdoFlights.setText("Flights");

        rdoBookings.setBackground(java.awt.SystemColor.scrollbar);
        buttonGroup3.add(rdoBookings);
        rdoBookings.setText("Bookings");

        rdoRoutes.setBackground(java.awt.SystemColor.scrollbar);
        buttonGroup3.add(rdoRoutes);
        rdoRoutes.setText("Routes");

        jLabel19.setText("Passenger");

        btnPointsHistory.setText("List Points History");
        btnPointsHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointsHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rdoPassengers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoAircraft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoDestinations)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoRoutes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoFlights)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoBookings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdoListAll))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboPassengers2, 0, 88, Short.MAX_VALUE)
                                .addComponent(cboFlightNumbers2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboAircraft2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cboPassengers3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPointsHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnItinerary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManifest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoPassengers)
                    .addComponent(rdoAircraft)
                    .addComponent(rdoDestinations)
                    .addComponent(rdoListAll, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoFlights)
                    .addComponent(rdoBookings)
                    .addComponent(rdoRoutes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cboPassengers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnItinerary, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cboFlightNumbers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManifest, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboAircraft2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cboPassengers3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPointsHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlRoutes.setBorder(javax.swing.BorderFactory.createTitledBorder("Routes"));

        pnlMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlMapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMapLayout = new javax.swing.GroupLayout(pnlMap);
        pnlMap.setLayout(pnlMapLayout);
        pnlMapLayout.setHorizontalGroup(
            pnlMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMapLayout.setVerticalGroup(
            pnlMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlRoutesLayout = new javax.swing.GroupLayout(pnlRoutes);
        pnlRoutes.setLayout(pnlRoutesLayout);
        pnlRoutesLayout.setHorizontalGroup(
            pnlRoutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRoutesLayout.setVerticalGroup(
            pnlRoutesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Passenger on Flight"));

        jLabel11.setText("Passenger");

        btnBookPassengerOnFlight.setText("Book");
        btnBookPassengerOnFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookPassengerOnFlightActionPerformed(evt);
            }
        });

        jLabel12.setText("Flight Number");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPassengers1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(3, 3, 3)
                .addComponent(cboFlightNumbers1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBookPassengerOnFlight)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jLabel12)
                .addComponent(btnBookPassengerOnFlight)
                .addComponent(cboPassengers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboFlightNumbers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Check-in Booked Passenger"));

        jLabel16.setText("Booking");

        btnCheckIn.setText("Check In");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboBookings, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCheckIn)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16)
                .addComponent(btnCheckIn)
                .addComponent(cboBookings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 225));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("These tabs are used to create the data necessary to run the airline. \n\nYou do not need to use these tabs, but you may if you wish to see how they work.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Introduction", jPanel5);

        jPanel2.setBackground(java.awt.SystemColor.info);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("New Aircraft"));

        jLabel7.setText("Manufacturer");

        btnCreateAircraft.setText("Create");
        btnCreateAircraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAircraftActionPerformed(evt);
            }
        });

        cboModel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "747", "767", "777" }));

        jLabel17.setText("Model");

        cboManufacturer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boeing", "Airbus" }));
        cboManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboManufacturerActionPerformed(evt);
            }
        });

        jLabel21.setText("Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboModel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateAircraft)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(btnCreateAircraft)
                .addComponent(cboModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17)
                .addComponent(cboManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel21)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Aircraft", jPanel2);

        jPanel1.setBackground(java.awt.SystemColor.info);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("New Destination"));

        jLabel6.setText("Airport Code");

        btnCreateDestination.setText("Create");
        btnCreateDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDestinationActionPerformed(evt);
            }
        });

        jLabel8.setText("City");

        jLabel1.setText("Map X");

        jLabel3.setText("Map Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMapX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMapY, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateDestination)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(btnCreateDestination)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(txtMapX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(txtMapY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Destinations", jPanel1);

        jPanel8.setBackground(java.awt.SystemColor.info);
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("New Route"));

        jLabel10.setText("From");

        jLabel18.setText("To");

        btnCreateRoute.setText("Create");
        btnCreateRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateRouteActionPerformed(evt);
            }
        });

        jLabel4.setText("Points");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(cboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(3, 3, 3)
                .addComponent(cboTo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnCreateRoute)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cboTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateRoute)
                    .addComponent(jLabel4)
                    .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jTabbedPane2.addTab("Routes", jPanel8);

        jPanel9.setBackground(java.awt.SystemColor.info);
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Schedule Flight"));

        jLabel23.setText("Number");

        jLabel24.setText("Aircraft");

        jLabel25.setText("Route");

        jLabel27.setText("Time");

        btnScheduleFlight.setText("Schedule");
        btnScheduleFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboAircraft1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboRoutes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnScheduleFlight)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(cboRoutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnScheduleFlight))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(cboAircraft1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        jTabbedPane2.addTab("Flights", jPanel9);

        jPanel3.setBackground(java.awt.SystemColor.info);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("New Passenger"));

        jLabel5.setText("Name");

        btnCreatePassenger.setText("Create");
        btnCreatePassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePassengerActionPerformed(evt);
            }
        });

        buttonGroup4.add(rdoAdult);
        rdoAdult.setText("Adult");

        buttonGroup4.add(rdoChild);
        rdoChild.setText("Child");

        jLabel2.setText("FFN");

        chkCrib.setText("Crib Needed");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoAdult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFFN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoChild)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCrib)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreatePassenger)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(rdoAdult)
                .addComponent(jLabel2)
                .addComponent(txtFFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rdoChild)
                .addComponent(chkCrib)
                .addComponent(btnCreatePassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Passengers", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addComponent(pnlRoutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlRoutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoListAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoListAllActionPerformed
        if (rdoPassengers.isSelected()) {
            txtOut.append(dohaAir.report("ALL", "Passenger", null));
        } else if (rdoAircraft.isSelected()) {
            txtOut.append(dohaAir.report("ALL", "Aircraft", null));
        } else if (rdoDestinations.isSelected()) {
            txtOut.append(dohaAir.report("ALL", "Destination", null));
        } else if (rdoRoutes.isSelected()) {
            txtOut.append(dohaAir.report("ALL", "Route", null));
        } else if (rdoFlights.isSelected()) {
            txtOut.append(dohaAir.report("ALL", "Flight", null));
        } else if (rdoBookings.isSelected()) {
            txtOut.append(dohaAir.report("ALL", "Booking", null));
        }
    }//GEN-LAST:event_rdoListAllActionPerformed

    private void btnCreatePassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePassengerActionPerformed
        String result;
        String name = txtPassengerName.getText();

        if (name.isEmpty()) {
            result = "Must specify passenger name";
        } else {
            if (rdoAdult.isSelected()) {
                String ffn = txtFFN.getText();

                if (ffn.isEmpty()) {
                    result = "Must specify frequent flyer number (FFN)";
                } else {
                    result = dohaAir.create(new Adult(name, Integer.parseInt(ffn)));
                    update();
                }
            } else {
                result = dohaAir.create(new Child(name, chkCrib.isSelected()));
                update();
            }
        }
        message(result);
    }//GEN-LAST:event_btnCreatePassengerActionPerformed

    private void btnCreateDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDestinationActionPerformed
        String result;
        String code = txtCode.getText();
        String city = txtCity.getText();
        String x = txtMapX.getText();
        String y = txtMapY.getText();

        if (code.isEmpty()) {
            result = "Must specify airport code";
        } else if (city.isEmpty()) {
            result = "Must specify city";
        } else if (x.isEmpty()) {
            result = "Must specify map coordinate X";
        } else if (y.isEmpty()) {
            result = "Must specify map coordinate Y";
        } else {
            result = dohaAir.create(new Destination(code, city, Integer.parseInt(x), Integer.parseInt(y)));
            update();
        }
        message(result);
    }//GEN-LAST:event_btnCreateDestinationActionPerformed

    private void btnCreateAircraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAircraftActionPerformed
        String result;
        String id = txtId.getText();
        String manufacturer = getItem(cboManufacturer);
        String model = getItem(cboModel);

        if (manufacturer.isEmpty()) {
            result = "Must select aircraft manufacturer";
        } else if (model.isEmpty()) {
            result = "Must select aircraft model";
        } else if (manufacturer.equals("Boeing")) {
            result = dohaAir.create(new Boeing(id, model));
            update();
        } else if (manufacturer.equals("Airbus")) {
            result = dohaAir.create(new Airbus(id, model));
            update();
        } else {
            result = "Error creating aircraft";
        }
        message(result);
    }//GEN-LAST:event_btnCreateAircraftActionPerformed

    private void btnCreateRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateRouteActionPerformed
        String result;
        String fromCode = getItem(cboFrom);
        String toCode = getItem(cboTo);
        String points = txtPoints.getText();

        if (fromCode.isEmpty()) {
            result = "Must specify originating airport code (from)";
        } else if (toCode.isEmpty()) {
            result = "Must specify destination airport code (to)";
        } else if (fromCode.equals(toCode)) {
            result = "From and to destination cannot be equal";
        } else if (points.isEmpty()) {
            result = "Must specify frequent flyer points";
        } else {
            Destination from = dohaAir.findDestination(fromCode);
            Destination to = dohaAir.findDestination(toCode);
            result = dohaAir.create(new Route(from, to, Integer.parseInt(points)));
            update();
        }
        message(result);
    }//GEN-LAST:event_btnCreateRouteActionPerformed

    private void btnBookPassengerOnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookPassengerOnFlightActionPerformed
        String result;
        String passengerName = getItem(cboPassengers1);
        String flightId = getItem(cboFlightNumbers1);

        if (passengerName.isEmpty()) {
            result = "Must specify passenger name";
        } else if (flightId.isEmpty()) {
            result = "Must specify flight id";
        } else {
            Passenger passenger = dohaAir.findPassenger(passengerName);
            Flight flight = dohaAir.findFlight(flightId);
            result = dohaAir.book(new Booking(passenger, flight));
            update();
        }
        message(result);
    }//GEN-LAST:event_btnBookPassengerOnFlightActionPerformed

    private void btnItineraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItineraryActionPerformed
        txtOut.append(dohaAir.report("ITINERARY", "Booking", getItem(cboPassengers2)));
    }//GEN-LAST:event_btnItineraryActionPerformed

    private void btnManifestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManifestActionPerformed
        txtOut.append(dohaAir.report("MANIFEST", "Booking", getItem(cboFlightNumbers2)));
    }//GEN-LAST:event_btnManifestActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        txtOut.append(dohaAir.report("SCHEDULE", "Flight", getItem(cboAircraft2)));
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void cboManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboManufacturerActionPerformed
        String selection = getItem(cboManufacturer);
        if (!selection.isEmpty()) {
            cboModel.setModel(new DefaultComboBoxModel(getModels(selection)));
        }
    }//GEN-LAST:event_cboManufacturerActionPerformed

    private void pnlMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMapMouseClicked
        txtMapX.setText(String.valueOf(evt.getX()));
        txtMapY.setText(String.valueOf(evt.getY()));
    }//GEN-LAST:event_pnlMapMouseClicked

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed

        String result = "Method not finished yet";
        String bookingId = getItem(cboBookings);

        if (bookingId.isEmpty()) {
            result = "Must select a booking";
        } else {
            Booking booking = dohaAir.findBooking(bookingId);

        
            // award frequent flyer points and set result
        
        
        }
        message(result);
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnScheduleFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleFlightActionPerformed
        String result;
        String number = txtFlightNumber.getText();
        String aircraftId = getItem(cboAircraft1);
        String routeId = getItem(cboRoutes);
        String time = txtTime.getText();

        if (number.isEmpty()) {
            result = "Must specify flight number";
        } else if (aircraftId.isEmpty()) {
            result = "Must specify aircraft";
        } else if (routeId.isEmpty()) {
            result = "Must specify route";
        } else if (time.isEmpty()) {
            result = "Must specify departure time";
        } else {
            Aircraft aircraft = dohaAir.findAircraft(aircraftId);
            Route route = dohaAir.findRoute(routeId);
            result = dohaAir.schedule(new Flight(number, aircraft, route, time));
            update();
        }
        message(result);
    }//GEN-LAST:event_btnScheduleFlightActionPerformed

    private void btnPointsHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointsHistoryActionPerformed

        String result = "Method not finished yet";
        String passengerName = getItem(cboPassengers3);

        if (passengerName.isEmpty()) {
            result = "Must select passenger";
        } else {
            Passenger passenger = dohaAir.findPassenger(passengerName);
            
            
            // set result to information about passenger including points history
            
            
        }
        message(result);

    }//GEN-LAST:event_btnPointsHistoryActionPerformed

    private void update() {
        draw();

        String[] array;
        cboManufacturer.setModel(new DefaultComboBoxModel(Aircraft.MANUFACTURERS));
        cboModel.setModel(new DefaultComboBoxModel(Boeing.MODELS));

        array = dohaAir.getIds("Aircraft");
        cboAircraft1.setModel(new DefaultComboBoxModel(array));
        cboAircraft2.setModel(new DefaultComboBoxModel(array));

        array = dohaAir.getIds("Flight");
        cboFlightNumbers1.setModel(new DefaultComboBoxModel(array));
        cboFlightNumbers2.setModel(new DefaultComboBoxModel(array));

        array = dohaAir.getIds("Destination");
        cboFrom.setModel(new DefaultComboBoxModel(array));
        cboTo.setModel(new DefaultComboBoxModel(array));

        array = dohaAir.getIds("Route");
        cboRoutes.setModel(new DefaultComboBoxModel(array));

        array = dohaAir.getIds("Passenger");
        cboPassengers1.setModel(new DefaultComboBoxModel(array));
        cboPassengers2.setModel(new DefaultComboBoxModel(array));
        cboPassengers3.setModel(new DefaultComboBoxModel(array));

        array = dohaAir.getIds("Booking");
        cboBookings.setModel(new DefaultComboBoxModel(array));
    }

    private void message(String message) {
        txtOut.append("*** " + message + " ***\n");
    }

    public static void main(String args[]) {
        invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    private String getItem(JComboBox cbo) {
        Object item = cbo.getSelectedItem();
        return item == null ? "" : item.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookPassengerOnFlight;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCreateAircraft;
    private javax.swing.JButton btnCreateDestination;
    private javax.swing.JButton btnCreatePassenger;
    private javax.swing.JButton btnCreateRoute;
    private javax.swing.JButton btnItinerary;
    private javax.swing.JButton btnManifest;
    private javax.swing.JButton btnPointsHistory;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnScheduleFlight;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox cboAircraft1;
    private javax.swing.JComboBox cboAircraft2;
    private javax.swing.JComboBox cboBookings;
    private javax.swing.JComboBox cboFlightNumbers1;
    private javax.swing.JComboBox cboFlightNumbers2;
    private javax.swing.JComboBox cboFrom;
    private javax.swing.JComboBox cboManufacturer;
    private javax.swing.JComboBox cboModel;
    private javax.swing.JComboBox cboPassengers1;
    private javax.swing.JComboBox cboPassengers2;
    private javax.swing.JComboBox cboPassengers3;
    private javax.swing.JComboBox cboRoutes;
    private javax.swing.JComboBox cboTo;
    private javax.swing.JCheckBox chkCrib;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnlMap;
    private javax.swing.JPanel pnlRoutes;
    private javax.swing.JRadioButton rdoAdult;
    private javax.swing.JRadioButton rdoAircraft;
    private javax.swing.JRadioButton rdoBookings;
    private javax.swing.JRadioButton rdoChild;
    private javax.swing.JRadioButton rdoDestinations;
    private javax.swing.JRadioButton rdoFlights;
    private javax.swing.JButton rdoListAll;
    private javax.swing.JRadioButton rdoPassengers;
    private javax.swing.JRadioButton rdoRoutes;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtFFN;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMapX;
    private javax.swing.JTextField txtMapY;
    private javax.swing.JTextArea txtOut;
    private javax.swing.JTextField txtPassengerName;
    private javax.swing.JTextField txtPoints;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
