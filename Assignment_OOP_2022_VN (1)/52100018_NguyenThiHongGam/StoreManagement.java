import java.io.*;
import java.util.*;

public class StoreManagement {
    private ArrayList<Staff> staffs;
    private ArrayList<String> workingTime;
    private ArrayList<Invoice> invoices;
    private ArrayList<InvoiceDetails> invoiceDetails;
    private ArrayList<Drink> drinks;

    public StoreManagement(String staffPath, String workingTimePath, String invoicesPath, String detailsPath, String drinksPath) {
        this.staffs = loadStaffs(staffPath);
        this.workingTime = loadFile(workingTimePath);
        this.invoices = loadInvoices(invoicesPath);
        this.invoiceDetails = loadInvoicesDetails(detailsPath);
        this.drinks = loadDrinks(drinksPath);
    }

    public ArrayList<Staff> getStaffs() {
        return this.staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs){
        this.staffs = staffs;
    }
    
    public ArrayList<Drink> loadDrinks(String filePath) {
        ArrayList<Drink> drinksResult = new ArrayList<Drink>();
        ArrayList<String> drinks = loadFile(filePath);

        for (String drink : drinks) {
            String[] information = drink.split(",");
            drinksResult.add(new Drink(information[0], Integer.parseInt(information[1])));
        }

        return drinksResult;
    }

    public ArrayList<Invoice> loadInvoices(String filePath) {
        ArrayList<Invoice> invoiceResult = new ArrayList<Invoice>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new Invoice(information[0], information[1], information[2]));
        }

        return invoiceResult;
    }

    public ArrayList<InvoiceDetails> loadInvoicesDetails(String filePath) {
        ArrayList<InvoiceDetails> invoiceResult = new ArrayList<InvoiceDetails>();
        ArrayList<String> invoices = loadFile(filePath);

        for (String invoice : invoices) {
            String[] information = invoice.split(",");
            invoiceResult.add(new InvoiceDetails(information[0], information[1], Integer.parseInt(information[2])));
        }

        return invoiceResult;
    }

    // requirement 1
    public ArrayList<Staff> loadStaffs(String filePath) {
        //code here and modify the return value
        ArrayList<Staff> Staffs = new ArrayList<Staff>();
        ArrayList<String> staff = loadFile(filePath);

        for (String sta : staff) {
            String[] information = sta.split(",");
            //System.out.println(information.length);
            if(information.length == 4) {
                Staffs.add(new FullTimeStaff(information[0], information[1],
                                    Integer.parseInt(information[2]), Double.parseDouble(information[3])));
            }
            else if(information.length == 5) {
            Staffs.add(new Manager(information[0], information[1],
                                    Integer.parseInt(information[2]), Double.parseDouble(information[3]),Integer.parseInt(information[4])));
            }
            else if(information.length == 3) {
            Staffs.add(new SeasonalStaff(information[0], information[1],
                                    Integer.parseInt(information[2])));
            }
        }
        return Staffs;
    }

    public HashMap<String,String> getWorkingTime() {
        HashMap <String,String> time = new HashMap<String,String>();
        for(int i=0; i<this.workingTime.size(); i++){
            String[] splitI = this.workingTime.get(i).split(",");
            time.put(splitI[0], splitI[1]);
        }
        return time;
    }

    // requirement 2
    public ArrayList<SeasonalStaff> getTopFiveSeasonalStaffsHighSalary() {
        HashMap <String,String> time = getWorkingTime();
        ArrayList<SeasonalStaff> five = new ArrayList<SeasonalStaff>();
        ArrayList<SeasonalStaff> result = new ArrayList<SeasonalStaff>(5);
        for(Staff i: this.staffs ) {
            if (i instanceof SeasonalStaff) {
                SeasonalStaff temp = (SeasonalStaff) i;
                five.add(temp);
            }
        }
        int time_=0 ;
        for(int j=0; j<5;j++) {
            for(String i: time.keySet()) {
                if( i.equals(five.get(0).getsID())) time_ =  Integer.parseInt(time.get(i));
            }
            Double max = five.get(0).paySalary(time_);
            for(int i=0; i<five.size(); i++) {
                for(String runInTime: time.keySet()) {
                    if( runInTime.equals(five.get(i).getsID())) time_ =  Integer.parseInt(time.get(runInTime));
                    }
                    if( (five.get(i).paySalary(time_) > max)) {
                        max = five.get(i).paySalary(time_);
                    } 
            }
            for(int i=0; i<five.size(); i++) {
                for(String runInTime: time.keySet()) 
                    if( runInTime.equals(five.get(i).getsID())) time_ =  Integer.parseInt(time.get(runInTime));
                    if( five.get(i).paySalary(time_) == max ) {
                        result.add(five.get(i));
                        five.remove(i);
                    }
            }
        }
        return result;
    }

    // requirement 3
    public ArrayList<FullTimeStaff> getFullTimeStaffsHaveSalaryGreaterThan(int lowerBound) {
        //code here and modify the return value
        HashMap <String, String> time = getWorkingTime();
        ArrayList<FullTimeStaff> sta  = new ArrayList<FullTimeStaff>();
        ArrayList<FullTimeStaff> res  = new ArrayList<FullTimeStaff>();
        for(Staff i: this.staffs) {
            if((i instanceof Manager) || (i instanceof FullTimeStaff)) {
                FullTimeStaff temp = (FullTimeStaff) i;
                sta.add(temp);
            }
        }
        int time_ = 0;
        for(FullTimeStaff j: sta) {
            for(String i: time.keySet()) {
                if( i.equals(j.getsID())) time_ =  Integer.parseInt(time.get(i));
            }
            if(j.paySalary(time_) > lowerBound) 
                res.add(j);
        }
        return res;
    }

    // requirement 4
    public double totalInQuarter(int quarter) {
        double total = 0;
        int[] quy = new int[3];
        if(quarter == 1) {
            quy[0] = 1;
            quy[1] = 2;
            quy[2] = 3;
        }
        if(quarter == 2) {
            quy[0] = 4;
            quy[1] = 5;
            quy[2] = 6;
        }
        if(quarter == 3) {
            quy[0] = 7;
            quy[1] = 8;
            quy[2] = 9;
        }
        if(quarter == 4) {
            quy[0] = 10;
            quy[1] = 11;
            quy[2] = 12;
        }
        for(Invoice i : invoices) {
            String[] getMonth = i.getDate().split("/");
            for(int cuaQuy: quy) {
                if(Integer.parseInt(getMonth[1]) == cuaQuy) {
                    for(InvoiceDetails det: invoiceDetails ) {
                        if(det.getInvoiceID().equals(i.getInvoiceID())) {
                            for(Drink dri: drinks) {
                                if( dri.getdName().equals(det.getDName())) {
                                    total += (double) dri.getPrice()*det.getAmount();
                                }
                            }
                        }
                    }
                }
            }
        }
        return total;
    }

    // requirement 5
    public Staff getStaffHighestBillInMonth(int month) {
        
        HashMap <String,Double> many_staffs = new HashMap<String,Double>();
        for(Staff i : staffs) {
            double total = 0;
            for(Invoice j: invoices) {
                String[] getMonth = j.getDate().split("/");
                if(j.getStaffID().equals(i.getsID()) && Integer.parseInt(getMonth[1])==month) {
                    
                    for(InvoiceDetails det: invoiceDetails ) {
                        if(det.getInvoiceID().equals(j.getInvoiceID())) {
                            for(Drink dri: drinks) {
                                if( dri.getdName().equals(det.getDName())) {
                                    total += (double) dri.getPrice()*det.getAmount();
                                }
                            }
                        }
                    }
                }
            }
            many_staffs.put(i.getsID(), total);
        }
        double total = 0;
        String max_Staff = "";
        for(String i: many_staffs.keySet()) {
            if(many_staffs.get(i) > total) {
                total = many_staffs.get(i);
                max_Staff = i;
            }
        }
        for(Staff i: this.staffs) {
            if(i.getsID().equals(max_Staff)) {
                return i;
            }
        }
        return null;
    }

    // load file as list
    public static ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);

            while ((data = fReader.readLine()) != null) {
                list.add(data);
            }

            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }

    public void displayStaffs() {
        for (Staff staff : this.staffs) {
            System.out.println(staff);
        }
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E tmp : list) {
                writer.write(tmp.toString());
                writer.write("\r\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }

    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);

            writer.write(object.toString());
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }

        return true;
    }
}