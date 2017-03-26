/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COLLISION PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Information about a potential collision
*/
public class msg_collision extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_COLLISION = 247;
    public static final int MAVLINK_MSG_LENGTH = 19;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COLLISION;


      
    /**
    * Unique identifier, domain based on src field
    */
    public long id;
      
    /**
    * Estimated time until collision occurs (seconds)
    */
    public float time_to_minimum_delta;
      
    /**
    * Closest vertical distance in meters between vehicle and object
    */
    public float altitude_minimum_delta;
      
    /**
    * Closest horizontal distance in meteres between vehicle and object
    */
    public float horizontal_minimum_delta;
      
    /**
    * Collision data source
    */
    public short src;
      
    /**
    * Action that is being taken to avoid this collision
    */
    public short action;
      
    /**
    * How concerned the aircraft is about this collision
    */
    public short threat_level;
    

    /**
    * Generates the payload for a MAVLink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COLLISION;
              
        packet.payload.putUnsignedInt(id);
              
        packet.payload.putFloat(time_to_minimum_delta);
              
        packet.payload.putFloat(altitude_minimum_delta);
              
        packet.payload.putFloat(horizontal_minimum_delta);
              
        packet.payload.putUnsignedByte(src);
              
        packet.payload.putUnsignedByte(action);
              
        packet.payload.putUnsignedByte(threat_level);
        
        return packet;
    }

    /**
    * Decode a collision message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.id = payload.getUnsignedInt();
              
        this.time_to_minimum_delta = payload.getFloat();
              
        this.altitude_minimum_delta = payload.getFloat();
              
        this.horizontal_minimum_delta = payload.getFloat();
              
        this.src = payload.getUnsignedByte();
              
        this.action = payload.getUnsignedByte();
              
        this.threat_level = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_collision(){
        msgid = MAVLINK_MSG_ID_COLLISION;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a MAVLink packet
    *
    */
    public msg_collision(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_COLLISION;
        unpack(mavLinkPacket.payload);        
    }

                  
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_COLLISION -"+" id:"+id+" time_to_minimum_delta:"+time_to_minimum_delta+" altitude_minimum_delta:"+altitude_minimum_delta+" horizontal_minimum_delta:"+horizontal_minimum_delta+" src:"+src+" action:"+action+" threat_level:"+threat_level+"";
    }
}
        