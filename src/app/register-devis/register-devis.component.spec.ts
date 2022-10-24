import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisterDevisComponent } from './register-devis.component';

describe('RegisterDevisComponent', () => {
  let component: RegisterDevisComponent;
  let fixture: ComponentFixture<RegisterDevisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegisterDevisComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegisterDevisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
