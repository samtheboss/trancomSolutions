package com.smartApps.tracomSolutions.controllers;

import java.util.List;

import com.smartApps.tracomSolutions.models.Branches;
import com.smartApps.tracomSolutions.models.Devices;
import com.smartApps.tracomSolutions.services.DevicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeviceController {
	@Autowired
    DevicesService devicesService;

	@GetMapping("/devices/test")
	public String test() {
		return "hello devices!";
	}
	
	@GetMapping("/devices")
	public List<Devices> getAllDevices() {
		return devicesService.getAllDevices();
	}

//	@GetMapping("/getDevicesBySerialNumber/{serialNumber}")
//	public ResponseEntity<Devices> findDeviceBySerialNumber(@PathVariable("serialNumber") String serialNumber) {
//		Devices device =devicesService.findDeviceBySerialNumber(serialNumber);
//		return new ResponseEntity<>(device, HttpStatus.OK);
//	}
	
	@PostMapping("/devices")
	public ResponseEntity<Boolean> addDevice(@RequestBody Devices device) {
		return devicesService.addDevice(device);
	}
}
