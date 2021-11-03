package com.smartApps.tracomSolutions.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smartApps.tracomSolutions.models.Devices;
import com.smartApps.tracomSolutions.services.DevicesService;

@RestController
@RequestMapping("/deviceApis")
public class DeviceController {
	@Autowired
	DevicesService devicesService;

	
	@GetMapping("/devices")
	public List<Devices> getAllDevices() {
		return devicesService.getAllDevices();
	}
	@GetMapping("/devices/{id}")
	public Optional<Devices> getAllDevices(@PathVariable(name="id") Long id) {
		return devicesService.getAllDevices(id);
	}
	
	@PostMapping("/devices")
	public ResponseEntity<String> addDevice(@RequestBody Devices device) {
		return devicesService.addDevice(device);
	}
	
	@PutMapping("/devices")
	public ResponseEntity<String> updateDevice(@RequestBody Devices device) {
		return devicesService.updateDevice(device);
	}
	@DeleteMapping("/devices/{id}")
	public  ResponseEntity<String> deleteDevice(@PathVariable(name="id") Long id) {
		return devicesService.deleteDevice(id);
	}
}
