import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sqroot'
})
export class SqrootPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return null;
  }

}
