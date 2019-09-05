package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Package;
import tws.repository.PackageMapper;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.List;

import java.util.Date;

@RestController
@RequestMapping("/packages")
public class PackageController {

    @Autowired
    private PackageMapper packageMapper;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");


    @GetMapping("")
    public ResponseEntity<List<Package>> getAll() {
        return ResponseEntity.ok(packageMapper.selectAll());
    }

    @PostMapping("")
    public ResponseEntity<Package> insert(@RequestBody Package packageInfo) {
    	packageMapper.insert(packageInfo);
        return ResponseEntity.created(URI.create("/packages/" + packageInfo.getId())).body(packageInfo);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Package> update(@PathVariable String id,@RequestBody Package packageInfo) {
    	packageMapper.update(id,packageInfo);
        return ResponseEntity.ok().build();
    }
}
