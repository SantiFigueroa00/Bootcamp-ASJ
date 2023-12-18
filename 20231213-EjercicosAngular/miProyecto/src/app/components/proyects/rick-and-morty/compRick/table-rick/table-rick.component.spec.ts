import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableRickComponent } from './table-rick.component';

describe('TableRickComponent', () => {
  let component: TableRickComponent;
  let fixture: ComponentFixture<TableRickComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TableRickComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TableRickComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
