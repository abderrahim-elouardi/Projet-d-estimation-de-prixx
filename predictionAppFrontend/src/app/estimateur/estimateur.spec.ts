import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Estimateur } from './estimateur';

describe('Estimateur', () => {
  let component: Estimateur;
  let fixture: ComponentFixture<Estimateur>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Estimateur]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Estimateur);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
