/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_table_management_system;

/**
 *
 * @author Vidushan
 */
public class LocationC {
    
    private int locationId;
    private String buildingName;
    private String  roomNumber;
    private int roomCapacity;
    private String roomType;
    
    public LocationC(int LocationId, String BuildingName, String  RoomNumber, int RoomCapacity,String RoomType){
        this.buildingName = BuildingName;
        this.roomNumber = RoomNumber;
        this.roomCapacity = RoomCapacity;
        this.roomType = RoomType;
        this.locationId = LocationId;
                
    }
    
    public int getLocationId(){
        return locationId;
    }
       public String getBuildingName(){
        return buildingName;
    }
       
       public String getRoomNumber(){
           return roomNumber;
       }
       
       
       public int getRoomCapacity(){
           return roomCapacity;
       }
       
       public String getRoomType(){
           return roomType;
       }
}
