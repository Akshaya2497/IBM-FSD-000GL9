import { Component ,OnInit} from '@angular/core';
import * as $ from 'jquery';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'portal-app';
  
  constructor(
    private modalService: NgbModal
  ) { }

  ngOnInit(): void {
   

    $(document).ready(() => {
      
      
      $("#inpt_search").on('focus', function () {
        $(this).parent('label').addClass('active');
      });
      
      $("#inpt_search").on('blur', function () {
        let num=$(this).val().toString();
        if(num.length == 0)
          $(this).parent('label').removeClass('active');
      });

      


    })
    

  }
  

  
}
